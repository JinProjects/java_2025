package jsp_basic;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class jsp025_join
 */
@WebServlet("/userJoin")
public class jsp025_join extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public jsp025_join() {
        super();
        // TODO Auto-generated constructor stub
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8"); //오타주의!
		PrintWriter out = response.getWriter();
		//1. 데이터 넘겨받기
		String name = (String)request.getParameter("userId");
		String pass = (String)request.getParameter("userPw");

		//2. DBManager 연동
		DBManager db = new DBManager();
		Connection conn = null;
		//3. Sql 구문처리
		PreparedStatement pstmt = null;// ResultSet rs = null;
		String sql = "insert into member (name, pass) values (?,?)"; //insert
		try {
			conn = db.getConnection();
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, name);
			pstmt.setString(2, pass);
			
			int result = pstmt.executeUpdate(); //insert, update, delete
			System.out.println("result:"+result);
			if(result > 0) {
				out.println("<script>alert('회원가입성공!'); location.href='/jsp022_login.jsp'; </script>");
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			
		}
		
		//4. 경로처리
		//response.sendRedirect("jsp022_login.jsp");
		//request.getRequestDispatcher("jsp022_login.jsp").forward(request, response);
	}

}
