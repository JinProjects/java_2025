<%@page import="jsp_basic.Servlet001"%>
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
		<h3 class="card-header">001.Servlet</h3>
		<pre class="alert alert-success my-3">
			1. 확장자는 .java
			2. java thread 이용해서 동작
			3. mvc 패턴에서 controller 역할 / Controller(Servlet, java);
		</pre>
		<h4> 1. java class 부품객체 사용 </h4>
		<%
		Servlet001 b = new Servlet001(10,20);
		out.println(b.getA());
		%>
		
		<h4> 2. servlet get/post</h4>
		<p> 
			예제) Servelt002 
			1. web.xml servlet controller 등록 - 배포관리
			2. @WebServlet("/Servlet002") 테스트용
		</p>
		
	</div>
</body>
</html>