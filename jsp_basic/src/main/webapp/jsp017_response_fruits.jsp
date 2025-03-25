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
		<h3>좋아하는 과일 정보</h3>
	</div>
	<div>
		<%
			String username = request.getParameter("username");
			String fruitname = request.getParameter("selectFruit");
			String btn = fruitname.equals("apple")? "btn-danger"
						 :fruitname.equals("banana")? "btn-warning"
						:"btn-success";
		%>
	</div>
	<div>
		<table class="table table-striped">
			<caption>SELECT 데이터 확인</caption>
			<tbody>
				<tr>
					<th>USER</th>
					<td><%=username %></td>
				</tr>
				<tr>
					<th>CHECK</th>
					<td><img alt="<%=fruitname %>" src="images/<%=fruitname.toLowerCase()%>.jpg"></td>
				</tr>
			</tbody>
		</table>
	</div>
	<div>
		<p><a href="javascript:history.go(-1)" class="btn <%=btn %>">BACK</a></p>
	</div>
</body>
</html>
<!-- jsp001_static.html -->