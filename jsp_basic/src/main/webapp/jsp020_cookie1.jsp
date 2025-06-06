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
<body><!-- jsp020_cookie1.jsp -->
	<div class="container card my-5">
		<h3 class="card-header">클라이언트(브라우저)에 저장되는 정보</h3>
		<table class="table table-striped table-bordered table-hover">
			<caption>cookie 상태확인</caption>
			<tbody>
			<%  //1. 쿠키가 설정되어 있는지 확인
				String cookie = request.getHeader("Cookie");
				out.println(cookie); 
				//JSESSIONID=048DD778C8CF1A84E91258978F310848 
				//톰캣에서 세션을 유지하기 위한 발급키
				
				//2. 쿠키 가져오기 - 2.jsp 쿠키저장 new Cookie("key1", "value1");
				if(cookie != null){
					Cookie[] cookies = request.getCookies();
					for(Cookie c : cookies){
						out.println("<tr><td>"+c.getName()+"</td>"+
										"<td>"+c.getValue()+"</td>"+
										"</tr>");
						
					}
				}
			%>
				<tr>
					<th></th>
					<td></td>
				</tr>
			</tbody>
		</table>
		<div>
			<a href="jsp020_cookie2.jsp" class="btn btn-danger">쿠키저장</a>
			<a href="jsp020_cookie3.jsp" class="btn btn-danger">쿠키삭제</a>
		</div>
	</div>
</body>
</html>
<!-- jsp001_static.html -->