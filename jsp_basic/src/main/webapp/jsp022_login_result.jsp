<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	/* String id = request.getParameter("userId");
	String pw = request.getParameter("userPw");
	session.setAttribute("userId", id);
	session.setAttribute("userPw", pw); */
	
	String id = request.getParameter("userId");
	String pw = request.getParameter("userPw");
	int result = -1;
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try{
	String sql = "select count(*) cnt, name, pass from member where name = ? and pass = ?";
	Class.forName("com.mysql.cj.jdbc.Driver");
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic","root","1234");
	pstmt = conn.prepareStatement(sql);
	
	pstmt.setString(1, id);
	pstmt.setString(2, pw);
	
	rs = pstmt.executeQuery();
		
	if(rs.next()){
		result = rs.getInt("cnt");
	}
	if(result == 1){
		session.setAttribute("userId", rs.getString("name"));
		session.setAttribute("userPw", rs.getString("pass"));
		request.getRequestDispatcher("jsp022_login_my.jsp").forward(request, response);
	}else{
		out.println("<script>alert('정보를 확인해주세요.'); history.go(-1); </script>");
	}
	
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(rs != null){ rs.close(); }
		if(pstmt != null){ pstmt.close(); }
		if(conn != null){ conn.close(); }
	}
%>