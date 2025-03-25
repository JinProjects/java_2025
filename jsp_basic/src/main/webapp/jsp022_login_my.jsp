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
<nav class="navbar navbar-light bg-light">
	<div class="container-fluid">
	<p class="navbar-brand">logo</p>
	<div class="d-flex">
		<%
			String id = (String)session.getAttribute("userId");
			if(id != null){
				out.println("<p class='me-2'>"+id+"</p>");
			}else{
				out.println("<script>alert('정보를 확인해주세요~');</script>");
			}
			
		%>
		<a href="jsp022_logout_action.jsp" class="me-2">logout</a>
	</div>
	</div>
	</nav>
	<div class="container card my-5">
		<h3 class="card-header"></h3>
		<table class="table table-striped bg-info">
			<tr><th>NO</th><td></td></tr>
			<tr><th>NAME</th><td></td></tr>
			<tr><th>PASS</th><td></td></tr>
		</table>
	</div>
</body>
</html>