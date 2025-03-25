<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	request.setCharacterEncoding("UTF-8");
	int ono = Integer.parseInt(request.getParameter("ono"));
	String oname = request.getParameter("oname");
	int onum = Integer.parseInt(request.getParameter("onum"));
	out.println(ono + "/" + oname + "/" + onum);
	
	Connection conn = null;
	PreparedStatement pstmt = null;
	String sql = "update milk_order set oname = ? , onum = ? where ono = ?";
	try{
		Class.forName("com.mysql.cj.jdbc.Driver");
		conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic","root","1234");
		pstmt = conn.prepareStatement(sql);
		pstmt.setString(1, oname);
		pstmt.setInt(2, onum);
		pstmt.setInt(3, ono);
		if(pstmt.executeUpdate()> 0){
			out.println("<script>alert('수정성공!'); location.href='milk.jsp'; </script>");
		}else{
			out.println("<script>alert('수정실패!'); location.href='milk.jsp'; </script>");
		}
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(pstmt != null){pstmt.close();}
		if(conn != null){conn.close();}
	}
	
%>
<!-- jsp001_static.html -->