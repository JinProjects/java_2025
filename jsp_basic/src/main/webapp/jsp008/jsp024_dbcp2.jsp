<%@page import="jsp_basic.DBManager"%>
<%@page import="jsp025_member.DBManager"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
<%@page import="java.sql.Connection"%> 
<%
	Connection conn = null;	
	DBManager db = new DBManager();
	conn = db.getConnection();
	
	if(conn != null) out.println("db연동");
%>



</body>
</html>