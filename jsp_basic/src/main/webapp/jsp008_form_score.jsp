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
		<h3 class="alert alert-info">FORM BASIC - SCORE</h3>
		<h4>SCORE</h4>
		<form action="jsp008_form_score_result.jsp" method="post">
			<div class="my-3">
				<label for="kor" class="form-kor">KOR:</label>
				<input type="number" class="form-control" id="kor" name="kor"
						min="0" max="100" value="0">
			</div>		
			<div class="my-3">
				<label for="eng" class="form-eng">ENG:</label>
				<input type="number" class="form-control" id="eng" name="eng"
				min="0" max="100" value="0">
			</div>		
			<div class="my-3">
				<label for="math" class="form-math">MATH:</label>
				<input type="number" class="form-control" id="math" name="math"
				min="0" max="100" value="0">
			</div>
			<div style="text-align:right;">
				<button class="btn btn-success">성적처리 프로그램입니다</button>			
			</div>
		</form>
	</div>
</body>
</html>
<!-- jsp001_static.html -->