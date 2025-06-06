<%@page import="java.util.Arrays"%>
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
		<h3 class="card-header">CHECKBOX - 다중선택</h3>
		<%
			String username = request.getParameter("username");
			String[] options1 = request.getParameterValues("option1");
			String radio = request.getParameter("optradio");
		%>
		<table class="table table-striped">
			<caption>checkbox 데이터 확인</caption>
			<tbody>
				<tr><th scope="row">USER</th><td><%=username %></td></tr>
				<tr><th scope="row">CHECK</th><td><%=Arrays.toString(options1) %></td></tr>
				<tr><th scope="row">RADIO</th><td><%=radio %></td></tr>
			</tbody>
		</table>
	</div>
</body>
</html>
<!-- jsp001_static.html -->