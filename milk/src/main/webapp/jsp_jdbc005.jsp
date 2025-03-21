<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
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
	<div class="container card my-5">
		<div class="alert alert-info">
			<span>Q2)score테이블에서 평균이 85이상 90이하인 학생을 출력하세요.(between 연산자 사용)</span>
		</div>
		<table class="table table-striped">
			<caption style="caption-side: top">성적표</caption>
		    <thead>
		      <tr>
		        <th>번호</th>
		        <th>이름</th>
		        <th>JAVA</th>
		        <th>JSP</th>
		        <th>PROJECT</th>
		        <th>EMAIL</th>
		        <th>TOTAL</th>
		        <th>AVG</th>
		      </tr>
		    </thead>
		    <tbody>
		    <%
		    	Connection conn = null;
		    	PreparedStatement pstmt = null;
		    	ResultSet rs = null;
		    	String sql = "select * from score where ssavg between 85 and 90";
		    	Class.forName("com.mysql.cj.jdbc.Driver");
		    	
		    	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic","root","1234");
		    	
		    	pstmt = conn.prepareStatement(sql);
		    	rs = pstmt.executeQuery();
		    	int sno = 0;
		  		String sname = "";
		  		int sjava = 0;
		  		int sjsp = 0;
		  		int sProject = 0;
		  		String semail = "";
		  		int sstotal = 0;
		  		double ssavg = 0;
		  		
		    	while(rs.next()){
		    		sno = rs.getInt("sno");
		    		sname = rs.getString("sname");
		    		sjava = rs.getInt("sjava");
		    		sjsp = rs.getInt("sjsp");
		    		sProject = rs.getInt("sProject");
		    		semail = rs.getString("semail");
		    		sstotal = rs.getInt("sstotal");
		    		ssavg = rs.getDouble("ssavg");
		    	
		    %>
		      <tr>
		        <td><%=sno %></td>
		        <td><%=sname %></td>
		        <td><%=sjava %></td>
		        <td><%=sjsp %></td>
		        <td><%=sProject %></td>
		        <td><%=semail %></td>
		        <td><%=sstotal %></td>
		        <td><%=ssavg %></td>
		      </tr>
		      <%
		      }
		    	rs.close();
		    	pstmt.close();
		    	conn.close();
		      %>
		    </tbody>
		  </table>
	</div>
</body>
</html>
<!-- jsp001_static.html -->