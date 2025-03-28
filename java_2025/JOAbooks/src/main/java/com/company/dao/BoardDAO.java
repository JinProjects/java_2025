package com.company.dao;

import java.net.InetAddress;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.company.dbmanager.DBManager;
import com.company.domain.BoardVO;

public class BoardDAO {
    //글쓰기  
	public int insert( BoardVO vo ){
		String sql = "insert into board( btitle, bcontent, bname, bip ) values (?,?,?,?)";
		int result = -1;
		DBManager db = new DBManager();
		Connection conn = null; 
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//DB연동
			conn = db.getConnection();
			//sql쿼리
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getBtitle());
			pstmt.setString(2, vo.getBcontent());
			pstmt.setString(3, vo.getBname());
			pstmt.setString(4, InetAddress.getLocalHost().getHostAddress());
			 
			result = pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) {
					pstmt.close();
				} 
				if(conn!=null) {
					conn.close();
				} 
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	//end
	
    //최신글읽기
	public ArrayList<BoardVO> selectAll(){
		//String sql = "select * from board order by bno desc";
		String sql = "select * from board order by bno desc";
		ArrayList<BoardVO> result = new ArrayList<>();
		
		DBManager db = new DBManager();
		Connection conn = null; 
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//DB연동
			conn = db.getConnection();
			//sql쿼리
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				result.add(new BoardVO(
						rs.getInt("bno"),
						rs.getString("btitle"),
						rs.getString("bcontent"),
						rs.getString("bname"),
						rs.getInt("bhit"),
						rs.getString("bdate"),
						rs.getString("bip")
					));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				} 
				if(pstmt!=null) {
					pstmt.close();
				} 
				if(conn!=null) {
					conn.close();
				} 
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
	//end
	
    //해당글읽기 
	public BoardVO select(int bno){
		String sql = "select * from board where bno = ?";
		DBManager db = new DBManager();
		Connection conn = null; 
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		BoardVO result = new BoardVO();
		try {
			//DB연동
			conn = db.getConnection();
			//sql쿼리
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			rs = pstmt.executeQuery();
			if(rs.next()) {
				result = new BoardVO(
							rs.getInt("bno"),
							rs.getString("btitle"),
							rs.getString("bcontent"),
							rs.getString("bname"),
							rs.getInt("bhit"),
							rs.getString("bdate"),
							rs.getString("bip")
						);
			}
			//int bno, String btitle, String bcontent, String bname, int bhit, String bdate, String bip
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(rs!=null) {
					rs.close();
				} 
				if(pstmt!=null) {
					pstmt.close();
				} 
				if(conn!=null) {
					conn.close();
				} 
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;
	}
	//end
	
    //조회수증가  
	public int updateHit(int bno){
		String sql = "update board set bhit=bhit+1 where bno=?";
		int result = -1;
		DBManager db = new DBManager();
		Connection conn = null; 
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//DB연동
			conn = db.getConnection();
			//sql쿼리
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) {
					pstmt.close();
				} 
				if(conn!=null) {
					conn.close();
				} 
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result;	
	}
	//end
	
    //해당글수정기능 
	public int update(BoardVO vo) { 
		String sql = "update board set btitle= ? , bcontent=? where bno = ?";
		int result = -1;
		DBManager db = new DBManager();
		Connection conn = null; 
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//DB연동
			conn = db.getConnection();
			//sql쿼리
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, vo.getBtitle());
			pstmt.setString(2, vo.getBcontent());
			pstmt.setInt(3, vo.getBno());
			
			result = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) {
					pstmt.close();
				} 
				if(conn!=null) {
					conn.close();
				} 
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result; 
	}
	//end
	
    //해당글삭제 
	public int delete(int bno){ 
		String sql = "delete from board where bno = ?";
		int result = -1;
		DBManager db = new DBManager();
		Connection conn = null; 
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			//DB연동
			conn = db.getConnection();
			//sql쿼리
			pstmt = conn.prepareStatement(sql);
			pstmt.setInt(1, bno);
			result = pstmt.executeUpdate();
			
			sql = " update board  "
				+ "    set bno = (bno-1)"
				+ " where bno >= (select bno from (select b.bno"
				+ "			   from board a right join"
				+ "					(select bno"
				+ "						from (select row_number() over(order by bno) as bno"
				+ "										from board) board2 ) b"
				+ "			on a.bno = b.bno"
				+ "			where a.bno is null) as t"
				+ "            limit 1)";
			
			pstmt = conn.prepareStatement(sql);
			pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(pstmt!=null) {
					pstmt.close();
				} 
				if(conn!=null) {
					conn.close();
				} 
			}catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return result; 
	}
	//end



}
