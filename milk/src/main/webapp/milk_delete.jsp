<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	int ono = Integer.parseInt(request.getParameter("ono"));
	String result = "관리자에게 문의바랍니다.";
	Connection conn = null; 
	PreparedStatement pstmt = null;
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		String sql = "delete from milk_order where ono = ?";
		
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic","root","1234");
		pstmt = conn.prepareStatement(sql);
		pstmt.setInt(1, ono);
		int num = pstmt.executeUpdate();
		
		if(num > 0){
			result = "삭제성공!";
		}
		out.println("<script> alert('"+result+"'); location.href='milk.jsp' </script> ");
		
	}catch(Exception e){
		
	}finally{
		if(pstmt!=null){pstmt.close();}
		if(conn!=null){conn.close();}
	}
%>
<!-- jsp001_static.html -->