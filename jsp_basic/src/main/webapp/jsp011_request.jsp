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
		<h3 class="card-header bg-info text-white">내장객체</h3>
		<pre>
		1. jsp페이지가 웹컨테이너에 의해 서블릿으로 변환될 때
		2. 고정된 이름의 객체 컨테이너로 자동으로 구현
		3. request(호출), response(응답), session(정보저장), out(출력)
		</pre>
	</div>
	
	<div class="container card my-5">
		<h3 class="card-header bg-info text-white">request</h3>
		<pre>
			1. action="처리컴포넌트"
			2. method="처리방식"
			3. name="사용자가 입력한 값 보관 이름"
		</pre>
		<!-- http://localhost:8080/jsp_basic/jsp015_checkbox.jsp?username=sally&option1=dog&option1=cat -->
		<form action="jsp015_checkbox.jsp" method="get" onsubmit="return checkbox()">
			<div class="mb-3 mt-3">
		    	<label for="username" class="form-label">NAME:</label>
			    <input type="text" class="form-control" id="username" 
			    placeholder="Enter email" name="username">
		  	</div><!-- user name -->
			<div class="form-check">
			  <input class="form-check-input" type="checkbox" 
			  		id="check1" name="option1" value="dog">
			  <label class="form-check-label" for="check1">DOG</label>
			</div>
			<div class="form-check">
			  <input class="form-check-input" type="checkbox" 
			  		id="check2" name="option1" value="cat" >
			  <label class="form-check-label" for="check2">CAT</label>
			</div>
			<div class="form-check">
			  <input class="form-check-input" type="checkbox" 
			  		id="check3" name="option1" value="pig" >
			  <label class="form-check-label" for="check3">PIG</label>
			</div>
			<div class="my-3">
				<button type="submit" class="btn btn-primary">전송</button>
			</div>
		</form>
		<script type="text/javascript">
			function checkbox(){		
				let name = document.querySelector("#username");
				/* let name = document.getElementById("username") */
				//다중선택
				let checkboxs = document.querySelectorAll(".form-check-input:checked");
				console.log(checkboxs);
				console.log(checkboxs.length)
				if(checkboxs.length == 0){
					alert("체크박스를 한개이상은 체크하셔야합니다.");
					return false;
				}
				if(name.value == ''){
					alert('빈칸입니다.');
					name.focus();
					return false;
				}
				
			}
		</script>
	</div>

<div class="container card bg-info my-5">
	<h3 class="card-header bg-info text-white">request(요청) - radio</h3>
</div>
<div class="container card my-5">
	<form action="jsp015_radio.jsp" method="get" onsubmit="return check2()">
			<div class="mb-3 mt-3">
		    	<label for="username1" class="form-label">NAME:</label>
			    <input type="text" class="form-control" id="username1" 
			    placeholder="사용자이름을 적어주세요!" name="username">
		  	</div><!-- user name -->
		  	<!-- RADIO -->
		  	<!-- RADIO -->
			<div class="form-check">
			  <input type="radio" class="form-check-input1" style="margin-right: 10px"
			  id="radio1" name="optradio" value="yes">YES
			  <label class="form-check-label" for="radio1"></label>
			</div>
			<div class="form-check">
			  <input type="radio" class="form-check-input1" style="margin-right: 10px"
			  id="radio1" name="optradio" value="no" >NO
			  <label class="form-check-label" for="radio1"></label>
			</div>
			<div class="form-check">
			  <input type="radio" class="form-check-input1" 
			  id="radio1" name="optradio" value="option3" style="margin-right: 10px" disabled>사용못함 - disabled
			  <label class="form-check-label" for="radio1"></label>
			</div>
		  	<!-- RADIO -->
		  	<!-- RADIO -->
			<div class="my-3">
				<button type="submit" class="btn btn-primary">전송</button>
			</div>
		</form>
	<script type="text/javascript">
		function check2(){
		let radio = document.querySelectorAll(".form-check-input1:checked");
		let name = document.querySelector("#username1");
			if(name.value == ''){
				alert('빈칸입니다.');
				name.focus();
				return false;
			}
			if(radio.length == 0){
				alert('radio버튼을 클릭해주세요');
				return false;
			}
		}
	</script>
</div>
<div class="container card bg-info my-5">
	<h3 class="card-header bg-info text-white">request(요청) - select</h3>
	<form action="jsp015_select.jsp" method="get" onsubmit="return check3()">
			<div class="mb-3 mt-3">
		    	<label for="username3" class="form-label">NAME:</label>
			    <input type="text" class="form-control" id="username3" 
			    placeholder="사용자이름을 적어주세요!" name="username">
		  	</div><!-- user name -->
		  	<!-- SELECT -->
		  	<!-- SELECT -->
		  	<label for="color">COLOR 선택 : </label>
			<select class="form-select" id="color" name="color">
			  <option selected="selected"></option>
			  <option value="bg-danger">RED</option>
			  <option value="bg-success">GREEN</option>
			  <option value="bg-primary">BLUE</option>
			  <option value="bg-dark">BLACK</option>
			</select>
		  	<!-- SELECT -->
		  	<!-- SELECT -->
			<div class="my-3">
				<button type="submit" class="btn btn-primary">전송</button>
			</div>
		</form>
</div>
<script type="text/javascript">
function check3(){
	let name = document.querySelector('#username3');
	let select = document.querySelector('#color > option:checked');
	console.log(select);
	if(name.value == ''){
		alert("빈칸입니다.");
		name.focus();
		return false;
	}
	if(select.value == ''){
		alert("빈칸입니다.");
		select.focus();
		return false;
	}
}

</script>
</body>
</html>
<!-- jsp001_static.html -->