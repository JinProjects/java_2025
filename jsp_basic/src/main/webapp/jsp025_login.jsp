<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="jsp022_header.jsp" %>
	<div class="container card my-5">
		<div class="my-5"> <%=session.getAttribute("userId") %></div>
		
		<form action="<%=request.getContextPath()%>/user_login" method="post" onsubmit="return checked()">
		<%-- <%
			String cookie = request.getHeader("Cookie");
			String sessionId = (String)session.getAttribute("userId");
			if(sessionId!= null){
				if(cookie != null){
					Cookie[] cookies = request.getCookies();
					for(Cookie c : cookies){
						if(c.getName().equals("userId")){
							%>
							<%@ include file="jsp022_login_my.jsp" %>
							<%
						}; 
					}
				}
			}else{
		%> --%>
		<h3 class="alert alert-info">FORM-LOGIN</h3>
		<p style="text-align:center;"><img alt="login" src="images/login.png" ></p>
			<h3>LOGIN</h3>
			<div class="my-3">
				<label for="userId" class="form-id">아이디</label><br>
				<input type="text" class="form-control" name="userId" id="userId"><br>
			</div>
			<div class="my-3">
				<label for="userPw" class="form-pass">비밀번호</label><br>
				<input type="text" class="form-control" name="userPw" id="userPw"><br>
			</div>
			<div class="my-3">
				<label for="chkbox" class="form-chkbox">REMEMBER</label>
				<input type="checkbox" name="chkbox" id="chkbox"><br>
			</div>
			<!-- <button class="btn btn-danger">검색</button> -->
			<input type="submit" title="login 하러가기" class="btn btn-danger" id="check" name="remember">
			<!-- <input type="submit" title="login 하러가기" class="btn btn-danger" id="chkCookie" name="remember" value="쿠키삭제"> -->
		</form>
	<%-- 	<%} %> --%>
	</div>
	<!-- footer.jsp  -->
	<!-- footer.jsp  -->
	<%@ include file="jsp022_footer.jsp" %>
	<script type="text/javascript">
		function checked(){
			let userId = document.querySelector("#userId");
			let userPw = document.querySelector("#userPw");
			let checkval = document.querySelector("#chkbox");
			
			if(userId.value == ''){
				alert("빈칸입니다.");
				userId.focus();
				return false;
			}
			if(userPw.value == ''){
				alert("빈칸입니다.");
				userPw.focus();
				return false;
			}
		}
	</script>
<!-- jsp001_static.html -->