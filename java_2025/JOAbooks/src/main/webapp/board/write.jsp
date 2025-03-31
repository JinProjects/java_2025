<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp" %>
	<div class="container card my-5">
		<h3>MULTIBOARD-글쓰기</h3>
		<h4>WRITE(CREATE)</h4>
		<form action="write.do" method="post" id="writeForm" onsubmit="return check()">
			<div class="my-3">
				<label for="bname">이름</label>
				<input type="text" class="form-control" id="bname" name="bname">
			</div>
			<div class="my-3">
				<label for="btitle">제목</label>
				<input type="text" class="form-control" id="btitle" name="btitle">
			</div>
			<div class="my-3">
				<label for="bcontent">내용</label>
				<textarea rows="10" cols="60" class="form-control" id="bcontent" name="bcontent" ></textarea>
			</div>
			<div class="d-grid gap-3">
				<input type="submit" class="btn btn-info btn-block text-white">
				<a href="javascript:history.go(-1)" class="btn btn-outline-secondary btn-block">취소</a>
				<a href="board/list.do" class="btn btn-outline-secondary btn-block">목록보기</a>
			</div>
		</form>
	</div>
	<script type="text/javascript">
		function check(){
			let bname = document.querySelector("#bname");
			let btitle = document.querySelector("#btitle");
			let bcontent = document.querySelector("#bcontent");
			
			if(bname.value == ''){
				alert("빈칸입니다.");
				username.focus();
				return false;
			}
			if(btitle.value == ''){
				alert("빈칸입니다.");
				btitle.focus();
				return false;
			}
			if(bcontent.value == ''){
				alert("빈칸입니다.");
				bcontent.focus();
				return false;
			}
		}
	</script>
<%@ include file="../inc/footer.jsp" %>