<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page isErrorPage = "true" %>
<% response.setStatus(200); %>    
    
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>title</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
		<script type="text/javascript">
			window.onload = function(){ //브라우저가 로딩되면 = 처리해주세요 {}
				let result = document.querySelector(".result");
				result.style.textAlign = 'center';
				//console.log(result);
					window.setTimeout(()=>{
					//	console.log('...3초뒤에 실행');
					location.href = "jsp019_error.jsp";
					},3000);
			}
		</script>
</head>
<body>
	<div class="container card bg-danger my-5">
		<h3 class="card-header bg-danger text-white"> ERROR 404 </h3>
		<p class="text-center bg-white p-3"><img alt="" src="images/error.png"></p>
		<p class="text-white result">요청하신 페이지가 없습니다. 관리자에게 문의바랍니다.</p>
	</div>
</body>
</html>
