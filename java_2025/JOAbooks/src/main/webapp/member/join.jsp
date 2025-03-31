<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>

<div class="container card my-5">
	<h3 class="card-header">회원가입 폼</h3>
	<div class="my-3">
		<form action="join.do" method="get" onsubmit="return check()">
			 <div>
				 <label for="mid">아이디</label>
				 <input type="text" class="form-control" id="mid" name="mid">
			 </div>
			 <div>
				 <label for="mpass">비밀번호</label>
				 <input type="password" class="form-control" id="mpass" name="mpass">
			 </div>
			 <div>
				 <label for="mid">비밀번호확인</label>
				 <input type="password" class="form-control">
			 </div>
			 <div>
				 <label for="mnickname">닉네임</label>
				 <input type="text" class="form-control" id="mnickname" name="mnickname">
			 </div>
			 <div>
				 <label for="memail">이메일</label>
				 <input type="email" class="form-control" id="memail" name="memail">
			 </div>
			 <div class="my-2">
			 	 <div>
					 <label for="btnAddress">주소</label>
			 	 </div>
			 	 <div class="d-flex">
					 <input type="text" class="form-control flex-fill" id="maddress1" name="maddress1" placeholder="주소">&nbsp;&nbsp;
					 <input type="button" onclick="address()" class="btn btn-info" id="btnAddress" value="주소검색">
			 	 </div>
			 	 <div class="my-2">
					 <input type="text" class="form-control my-2" id="maddress2" name="maddress2" placeholder="우편번호">
					 <input type="text" class="form-control my-2" id="maddress3" name="maddress3" placeholder="상세주소입력">
			 	 </div>			 	
			 </div>
			 <div class="d-flex justify-content-center">
			 	<input type="submit" class="btn btn-outline-primary btn-sm" id="btnJoin" name="btnJoin" value="가입하기">&nbsp;
			 	<input type="button" class="btn btn-outline-danger btn-sm" id="btnCancle" name="btnCancle" value="취소">
			 </div>
		</form>
		<script type="text/javascript">
			document.querySelector('#btnCancle').addEventListener('click',function(){
				history.go(-1);
			});
			function address(){
				new daum.Postcode({
			        oncomplete: function(data) {
			            let addr = '';
			            let extraAddr = '';
			            if(data.userSelectedType === 'R'){
			            	addr = data.roadAddress;
			            }else{
			            	addr = data.jibunAddress;
			            }
			            
			            if(data.userSelectedType === 'R'){
			            	if(data.bname !==  '' && /[동|로|가]$/g.test(data.bname)){
			            		extraAddr += data.bname;
			            	}
			            	if(extraAddr !== ''){
			            		extraAddr = '(' + extraAddr + ','+data.buildingName+')' ;
			            	}
			            	document.getElementById('maddress1').value = addr+extraAddr; 
			        }else{
			        	document.getElementById('maddress1').value = addr;
			        }
			       
			        document.getElementById('maddress2').value = data.zonecode;
			        //document.getElementById('maddress1').value = addr;
			        
			        document.getElementById('maddress3').focus();
			        
			        }
			    }).open();
			};
		</script>
	</div>
</div>
<%@ include file="../inc/footer.jsp" %>