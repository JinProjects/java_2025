<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%@page import="javax.naming.*"%>
<%@page import="javax.sql.*"%>
<%@page import="java.sql.Connection"%>
<%
Context initContext = new InitialContext();
Context envContext  = (Context)initContext.lookup("java:/comp/env");
DataSource ds         = (DataSource)envContext.lookup("jdbc/mbasic");
Connection conn = ds.getConnection();
if(conn!=null){  out.println("db연동성공!");}
%>

<hr/>

<div> 

</div>



</body>
</html>