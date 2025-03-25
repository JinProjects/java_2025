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
		<%
		application.setAttribute("name", "D.application - 웹어플리케이션 실행");
			session.setAttribute("name", "C.session - 브라우저 종료/로그인 후 아이디 유지");
			request.setAttribute("name", "B.request - a.jsp -> b.jsp로 요청할 때");
		pageContext.setAttribute("name", "A.현재페이지에서만 유지 ");
		%>
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
	</div>
</body>
</html>
<!-- jsp001_static.html -->