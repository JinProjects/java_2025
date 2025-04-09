<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
</head>
<body>
${list} <!-- el -->
	<div class="container card">
		<h3 class="card-header bg-success text-white"> USERS </h3>
		<!-- 		for( UserDto u : list ){}			 -->
		<c:forEach var="u" items="${list }" varStatus="status"> <!-- jstl -->
			<div class="alert alert-warning my-3">
			<a href="detail.users?no=${u.no}">
				NO : ${u.no} - NAME: ${u.name } - AGE: ${u.age}
			</a>
			</div>
		</c:forEach>
		
		<form method="post" 
             action="insert.users"   id="userInsert" onsubmit="return check()">
           <fieldset> 
           <legend>유저입력폼</legend>
            <div class="form-group"> 
               <label for="name4">이름</label>
               <input type="text" name="name"   id="name4"   class="form-control"/>
            </div>   
          <div class="form-group"> 
               <label for="age4">나이</label>
               <input type="number" name="age"   id="age4"   class="form-control"/>
            </div>           
            <div class="form-group">
               <input type="submit" value="전송"  class="btn  btn-danger"/>
            </div>
         </fieldset>      
      </form> 
      <!-- <form method="post" 
             action="update.users"   id="userInsert" onsubmit="return check()">
           <fieldset> 
           <legend>유저수정폼</legend>
            <div class="form-group"> 
               <label for="name4">번호</label>
               <input type="text" name="no"   id="no4"   class="form-control"/>
            </div>   
            <div class="form-group"> 
               <label for="name4">이름</label>
               <input type="text" name="name"   id="name4"   class="form-control"/>
            </div>   
          <div class="form-group"> 
               <label for="age4">나이</label>
               <input type="number" name="age"   id="age4"   class="form-control"/>
            </div>           
            <div class="form-group">
               <input type="submit" value="전송"  class="btn  btn-danger"/>
            </div>
         </fieldset>      
      </form>  -->
      <form method="get" 
             action="delete.users"   id="userInsert" onsubmit="return check()">
           <fieldset> 
           <legend>유저삭제폼</legend>
            <div class="form-group"> 
               <label for="name4">번호</label>
               <input type="text" name="no"   id="no4"   class="form-control"/>
            </div>
            <div class="form-group">
               <input type="submit" value="전송"  class="btn  btn-danger"/>
            </div>   
         </fieldset>      
      </form> 
	</div>
	<script type="text/javascript">
		function check(){
			let no = document.querySelector("#no4");	
			let name = document.querySelector("#name4");	
			let age = document.querySelector("#age4");
			
			if(no.value == ''){
				alert("빈값입니다.");
				return false;
			}
			if(name.value == ''){
				alert("빈값입니다.");
				return false;
			}
			if(age.value == ''){
				alert("빈값입니다.");
				return false;
			}
		}
	</script>
</body>
</html>