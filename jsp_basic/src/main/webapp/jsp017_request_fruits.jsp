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
	<div class="container card bg-info my-5">
		<h3>select box</h3>
	</div>
	<div class="container card my-5">
		<h3>좋아하는 과일선택</h3>
		<form action="jsp017_response_fruits.jsp" method="get" onsubmit="return check()">
			<div class="mb-3 mt-3">
				<label for="username">사용자이름</label>
				<input type="text" class="form-control" id="username" name="username">	
			</div>
			<div class="mb-3 mt-3">
				<label for="selectFruit">좋아하는 과일선택</label>
				<select class="form-select" id="selectFruit" name="selectFruit">
					<option value="">== 선택 ==</option>
					<option value="apple">APPLE</option>
					<option value="banana">BANANA</option>
					<option value="coconut">COCONUT</option>
				</select>	
			</div>
			<div class="d-grid">
				<button type="submit" class="btn btn-danger btn-block">수신체크하러가기</button>
			</div>
		</form>
	</div>
	<script type="text/javascript">
		function check(){
			let name = document.querySelector('#username');
			let option = document.querySelector('#selectFruit > option:checked');
			if(name.value == ''){
				alert('빈칸입니다.');
				name.focus();
				return false;
			}
			
			if(option.value == ''){
				alert('빈칸입니다.');
				option.focus();
				return false;
			}
			
		}
	</script>
</body>
</html>
<!-- jsp001_static.html -->