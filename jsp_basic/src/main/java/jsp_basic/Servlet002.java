package jsp_basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet002
 */
// Test용도
// ctrl + f11
// http://localhost:8080/jsp_basic/Servlet002
@WebServlet("/Servlet002")
public class Servlet002 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	int initCnt = 1;
	int doGetCnt = 1;
	int destroyCnt = 1;
    public Servlet002() {
        super();
        // TODO Auto-generated constructor stub
    }
   @Override
	public void init(ServletConfig config) throws ServletException {
	   System.out.println("#1. init() 첫요청에만 호출 >" + initCnt++);
	}
    @Override
    public void destroy() {
    	System.out.println("파일 조금 수정하고 ctrl + s 저장");
		System.out.println("#3. destroy() 맨 마지막에만 호출 >" + destroyCnt++);
    }
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("#2-1. get" + doGetCnt++);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("#2-2. post");
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8"); //오타주의!
		PrintWriter out = response.getWriter();
		//1. 데이터 넘겨받기
		String name = request.getParameter("name");
		String pass = request.getParameter("pass");
		System.out.println(1);
		//2. DBManager 연동
		DBManager db = new DBManager();
		Connection conn = db.getConnection();
		//3. Sql 구문처리
		PreparedStatement pstmt = null;// ResultSet rs = null;
		String sql = "insert into member (name, pass) values (?,?)"; //insert
		try {
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, pass);
			
			int result = pstmt.executeUpdate(); //insert, update, delete
			System.out.println("result:"+result);
			if(result > 0) {
				out.println("<script>alert('회원가입성공!'); location.href='jsp022_login.jsp'; </script>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			try {
			if(pstmt != null){pstmt.close();}
			if(conn != null){conn.close();}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
