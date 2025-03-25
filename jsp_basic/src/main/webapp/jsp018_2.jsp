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
		<h3>내장객체 유효범위</h3>
		<pre class="alert alert-warning my-3">
			1. application(웹어플리케이션이 실행되고 있는 동안 유지 ex) 톰캣끄기 전 ) >
					session(브라우저 종료) > request(요청) > page (현재페이지만)
					
			2. 객체.setAttribute("속성","값") / 객체.getAttribute("속성");  
		</pre>
	
		<table class="table table-striped">
			<caption>SCOPE - 내장객체 유효범위</caption>
			<tbody>
				<tr>
					<th scope="row">page</th>
					<td><%= pageContext.getAttribute("name") %></td>
				</tr>
				<tr>
					<th scope="row">request</th>
					<td><%= request.getAttribute("name") %></td>
				</tr>
				<tr>
					<th scope="row">session</th>
					<td><%= session.getAttribute("name") %></td>
				</tr>
				<tr>
					<th scope="row">application</th>
					<td><%= application.getAttribute("name") %></td>
				</tr>
			</tbody>
		</table>
		<p><%=request.getParameter("a") %></p>
		<p><a href="jsp018_scope.jsp" class="btn btn-danger">BACK</a></p>
	</div>
</body>
</html>
<!-- jsp001_static.html -->