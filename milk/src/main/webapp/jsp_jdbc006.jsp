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
<div>
	<div class="alert alert-info">
			<span>Q3)in연산자를 사용하여 학생번호가 1,2,3인 학생의 번호, 이름, 평균을 출력</span>
		</div>
	<table class="table table-striped">
    <thead>
      <tr>
        <th>번호</th>
        <th>이름</th>
        <th>AVG</th>
      </tr>
    </thead>
    <tbody>
    	<%
    		Connection conn = null;
    		PreparedStatement pstmt = null;
    		ResultSet rs = null;
    		Class.forName("com.mysql.cj.jdbc.Driver");
    		String sql = "select * from score where sno in (1,2,3)";
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
	    		ssavg = rs.getDouble("ssavg");
    	%>
      <tr>
        <td><%=sno %></td>
        <td><%=sname %></td>
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