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
		int kor = Integer.parseInt(request.getParameter("kor"));
		int eng = Integer.parseInt(request.getParameter("eng"));
		int math = Integer.parseInt(request.getParameter("math"));
		int total = kor+eng+math; 
		double avg = total/3.0;
		String result = "";
		String grade = "";
		
		if(avg>=60&&(kor>=40&&eng>=40&&math>=40)){
			result ="모두통과";
		}
		if(avg>=90){
			grade = "A";
		}else if(avg>=80){
			grade = "B";
		}else if(avg>=70){
			grade = "C";
		}else{
			grade = "D";
		}
	%>
	<table class="table table-bordered table-striped table-hover my-5">
    <thead>
      <tr>
        <th scope="col">KOR</th>
        <th scope="col">ENG</th>
        <th scope="col">MATH</th>
        <th scope="col">TOTAL</th>
        <th scope="col">AVG</th>
      </tr>
    </thead>
    <tbody>
    	<tr>
    		<td><%=kor %></td>
    		<td><%=eng %></td>
    		<td><%=math %></td>
    		<td><%=total %></td>
    		<td><%=String.format("%.2f", avg) %></td>
    	</tr>
    </tbody>
  </table>
	<div class="container card my-5">
		<h3 class="alert alert-info">FORM - SCORE</h3>
		<div>
			<label for="kor" class="form-kor">국어:</label>
			<span><%=kor %></span>
		</div>
		<div>
			<label for="eng" class="form-eng">영어:</label>
			<span><%=eng %></span>
		</div>
		<div>
			<label for="math" class="form-math">수학:</label>
			<span><%=math %></span>
		</div>
		<div>
			<label for="total" class="form-total">총점:</label>
			<span><%=total%></span>
		</div>
		<div>
			<label for="avg" class="form-avg">평균:</label>
			<span id="avg"><%=String.format("%.2f", avg) %></span>
		</div>
		<div>
			<label for="result" class="form-avg">합격여부:</label>
			<span id="result"><%=result %></span>
		</div>
		<div>
			<label for="grade" class="form-avg">등급:</label>
			<span id="grade"><%=grade %></span>
		</div>
		
		<div>
			<button type="submit" class="btn btn-danger" id="btnBack">처음으로 이동</button>
		</div>
	</div>
	<script type="text/javascript">
		document.getElementById('btnBack').onclick = function(){
			history.back();
		}
	</script>
</body>
</html>
<!-- jsp001_static.html -->