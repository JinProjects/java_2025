<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>
<div class="container card my-5">
	<h3 class="card-header">
		LOGIN PAGE
	</h3>
	<div>
		<form action="/member/login.do" method="post" onsubmit="return check()">
			<div class="my-3">
				<label for="userId">아이디</label>
				<input type="text" class="form-control" id="userId" name="userId">			
			</div>
			<div class="my-3">
				<label for="userPw">비밀번호</label>
				<input type="text" class="form-control" id="userPw" name="userPw">			
			</div>
			<div class="d-grid gap-3">
				<input type="submit" class="btn btn-info text-white btn-block" value="로그인">
				<a href="/board/join.do" class="btn btn-outline-primary btn-block">가입하기</a>
				<a href="javascript:history.go(-1)" class="btn btn-outline-primary btn-block">돌아가기</a>
			</div>
		</form>	
	</div>
</div>
<%@ include file="../inc/footer.jsp" %>