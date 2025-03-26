package jsp_basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class jsp025_login
 */
@WebServlet("/user_login")
public class jsp025_login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jsp025_login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		PrintWriter out= response.getWriter();
		String name = request.getParameter("userId");
		String pass = request.getParameter("userPw");
		int result = -1;
		DBManager db = new DBManager();
		Connection conn = null; PreparedStatement pstmt = null; ResultSet rs = null;
		String sql = "select count(*) cnt from member where name=?, pass=?";
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, pass);
			
			rs = pstmt.executeQuery();
			
			
			if(rs.next()) {
				result = rs.getInt("cnt");
			}
			
			if(result == 1) {
				HttpSession session = request.getSession();
				session.setAttribute("username", name);
				//response.sendRedirect("jsp025_my.jsp");
				out.println("<script>alert('정보를 확인해주세요.'); location.href='jsp025_my.jsp'</script>");
			}else {
				out.println("<script>alert('정보를 확인해주세요.'); history.go(1);</script>");
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			try {
				if(rs != null) {
						rs.close();
				}
				if(pstmt != null) {
					pstmt.close();
				}
				if(conn != null) {
					conn.close();
				}
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
