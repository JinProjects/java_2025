<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8"%>
<%@include file="../inc/header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container card d-block">
		<form action="login_post.do" method="post" onsubmit="return chkLogin()">
			<h3 class="card-header bg-info text-white">로그인폼</h3>
			<div class="mb-3">
				<label for="mid">아이디</label>
				<input type="text" class="form-control" id="mid" name="mid">
			</div>
			<div class="mb-3">
				<label for="mpass">비밀번호</label>
				<input type="text" class="form-control" id="mpass" name="mpass">
			</div>
			<div class="mb-3">
				<input type="submit" class="btn btn-warning d-block" value="로그인" >
				<input type="submit" class="btn btn-warning d-block" value="아이디찾기" >
				<input type="submit" class="btn btn-warning d-block" value="비밀번호찾기" >
			</div>
		</form>
	</div>
	<script type="text/javascript">
		function chkLogin(){
			let mid = document.querySelector('#mid');
			let mpass = document.querySelector('#mpass');
			
			if(mid.value == ''){
				alert('빈값입니다.');
				return false;		
			}
			if(mpass.value == ''){
				alert('빈값입니다.');
				return false;
			}
		}
	</script>
<%@include file="../inc/footer.jsp" %>
