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
	<div class="navbar navbar-expand-sm bg-danger">logo</div>
	<div class="container card my-5">
		<h3 class="alert alert-info">FORM-LOGIN</h3>
		<p style="text-align:center;"><img alt="login" src="images/login.png" ></p>
		<form action="jsp006_form_login_result.jsp" method="post">
			<h3>LOGIN</h3>
			<div class="my-3">
				<label for="userId" class="form-id">아이디</label><br>
				<input type="text" class="form-control" name="userId" id="userId"><br>
			</div>
			<div class="my-3">
				<label for="pass" class="form-pass">비밀번호</label><br>
				<input type="text" class="form-control" name="pass" id="pass"><br>
			</div>
			<div class="my-3">
				<label for="chkbox" class="form-chkbox">REMEMBER</label>
				<input type="checkbox" name="chkbox" id="chkbox"><br>
			</div>
			<!-- <button class="btn btn-danger">검색</button> -->
			<input type="submit" title="login 하러가기" class="btn btn-danger" id="check" name="remember">
		</form>
	</div>
	<script type="text/javascript">
		
	</script>
</body>
</html>
<!-- jsp001_static.html -->