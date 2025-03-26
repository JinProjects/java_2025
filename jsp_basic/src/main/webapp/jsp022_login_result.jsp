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
	String[] check = request.getParameterValues("chkbox");
	int result = -1;
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	try{
	String sql = "select count(*) 'cnt' from member where name = ? and pass = ?";
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
			//request.getRequestDispatcher("jsp022_login_my.jsp").forward(request, response);
			out.println("<script>location.href='jsp022_login_my.jsp';</script>"); //바로 경로 넘기기
			session.setAttribute("userId", id);
			session.setAttribute("userPw", pw);
			if(check != null){
				out.println("<script>alert('"+check[0]+"');</script>");
				Cookie rememId = new Cookie("userId",id);
				rememId.setMaxAge(60*60*24);
				response.addCookie(rememId);
			}
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