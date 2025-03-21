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
		<form action="/input.do" method="post" id="form">
			<div class="my-3">
				<label for="id">아이디  : </label>
				<input type="text" id="id" name="id">
			</div>
			<div class="my-3">
				<label for="pw">비밀번호:</label>
				<input type="text" id="pw" name="pw">
			</div>
				<input type="button" value="계정확인">
			<div class="my-3">
				<label for="deposit">입금  :</label>
				<input type="text" id="deposit" name="pw">
			</div>
		</form>
	</div>
	<script type="text/javascript">
		let id = document.getElementById('id');
		let pw = document.getElementById('pw');
		
		let form = document.getElementById('form');
		form.action = '/accountChk.do'+'&id='+id+'&pw'+pw;
		form.submit;
		
	</script>
</body>
</html>
<!-- jsp001_static.html -->