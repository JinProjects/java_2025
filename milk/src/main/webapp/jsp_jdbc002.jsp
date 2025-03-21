<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
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
	<caption style="caption-side: top">우유판매현황</caption>
    <thead>
      <tr>
        <th>주문번호</th>
        <th>주문이름</th>
        <th>주문가격</th>
      </tr>
    </thead>
    <tbody>
    <%
    	String sql = "select * from milk";
    	Class.forName("com.mysql.cj.jdbc.Driver");
    	Connection conn = null; 
    	PreparedStatement pstmt = null;
    	ResultSet rs = null;
    	
    	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic","root","1234");
    	 
    	pstmt = conn.prepareStatement(sql);
    	rs = pstmt.executeQuery();
    	String mno = "";
    	String mname = "";
    	String mprice = "";
    	
    	while(rs.next()){
    		mno = rs.getString("mno");
    		mname = rs.getString("mname");
    		mprice = rs.getString("mprice");
    %>
      <tr>
        <td><%=mno %></td>
        <td><%=mname %></td>
        <td><%=mprice %></td>
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