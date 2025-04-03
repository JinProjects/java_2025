<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>
<body>
	<div class="container card">
		<h3 class="card-header bg-success text-white">board</h3>
		<c:forEach var="b" items="${list }" varStatus="status">
		<div class="alert alert-warning my-3">
			<a href="detail.users?no=${b.bno}">
				NO : ${b.bno} - NAME: ${b.bname } - TITLE: ${b.btitle } - DATE: ${b.bdate}
			</a>
		</div>
		</c:forEach>
		<form action="insert.do" method="get">
			<fieldset>
				<legend>글쓰기 폼</legend>
				<div class="form-group">
					<label for="bcontent">작성자</label>
					<input type="text" name="bname" id="bname"> 
				</div>
				<div class="form-group">
					<label for="bcontent">비밀번호</label>
					<input type="text" name="bpass" id="bpass"> 
				</div>
				<div class="form-group">
					<label for="btitle">제목</label>
					<input type="text" name="btitle" id="btitle"> 
				</div>
				<div class="form-group">
					<label for="bcontent">내용</label>
					<input type="text" name="bcontent" id="bcontent"> 
				</div>
				<input type="submit" value="글쓰기" class="btn btn-danger">
			</fieldset>
		</form>
	</div>
</body>
</html>