<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>title</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
	<table class="table table-striped">
	<caption style="caption-side: top">커피판매현황</caption>
    <thead>
      <tr>
        <th>Firstname</th>
        <th>Lastname</th>
        <th>Email</th>
      </tr>
    </thead>
    <tbody>
    <%
    	Connection conn = null;
    	PreparedStatement pstmt = null;
    	ResultSet rs = null;
    	String sql = "select * from coffee where cprice < 3000";
    	
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic","root","1234");
    	pstmt = conn.prepareStatement(sql);
    	rs = pstmt.executeQuery();
    	int cno = 0;
    	String cname = "";
    	int cprice = 0;
    	
    	while(rs.next()){
    		cno = rs.getInt("cno");
    		cname = rs.getString("cname");
    		cprice = rs.getInt("cprice");
    %>
      <tr>
        <td><%=cno %></td>
        <td><%=cname %></td>
        <td><%=cprice %></td>
      </tr>
      <%
    	}
    	rs.close();
    	pstmt.close();
    	conn.close();
      %>
    </tbody>
  </table>
</body>
</html>
<!-- jsp001_static.html -->