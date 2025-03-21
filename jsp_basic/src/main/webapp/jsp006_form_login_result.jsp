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
	<%
		String email = request.getParameter("email");
		String pass = request.getParameter("pass");
		String remember = request.getParameter("chkbox");
	
	%>
	<div class="container card my-5">
		<h3>LOGIN RESULT</h3>
		<div class="alert alert-info" style="font-size:1.5em">
			EMAIL : <%=email %><br>
			PASS : <%=pass %><br>
			remember : <%=remember %><br>
		</div>
		<!-- <button class="btn btn-danger" class="btnBack" id="btnBack">처음으로</button> -->
		<p><a href="jsp006_form_login.jsp">BACK</a></p>
	</div>
	<script type="text/javascript">
		document.getElementById('btnBack').onclick = function(){
			history.back();
		}		
	</script>
</body>
</html>
<!-- jsp001_static.html -->