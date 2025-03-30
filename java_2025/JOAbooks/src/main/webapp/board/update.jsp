<%@page import="com.company.domain.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    	<%@ include file="../inc/header.jsp" %>
<div class="container card my-5">
		<h3>MULTIBOARD-상세보기</h3>
		<form action="edit.do?bno=${dto.bno}" method="post" onsubmit="return update()">
			<div class="my-3">
				<label for="username">이름</label>
<%-- 				<input type="text" class="form-control" id="username" name="username" value="<%=vo.getBname()%>" disabled="disabled"> --%>
				<input type="text" class="form-control" id="username" name="username" value="${dto.bname }" disabled="disabled">
			</div>
			<div class="my-3">
				<label for="btitle">제목</label>
				<%-- <input type="text" class="form-control" id="btitle" name="btitle" value="<%=vo.getBtitle()%>" disabled="disabled"> --%>
				<input type="text" class="form-control" id="btitle" name="btitle" value="${dto.bname }" disabled="disabled">
			</div>
			<div class="my-3">
				<label for="bcontent">내용</label>
<%-- 				<textarea rows="5" cols="" class="form-control" id="bcontent" name="bcontent" ><%=vo.getBcontent() %></textarea> --%>
				<textarea rows="5" cols="" class="form-control" id="bcontent" name="bcontent"  disabled="disabled">${dto.bcontent }</textarea>
			</div>
			<div class="d-grid gap-3">
				<input type="button" class="btn btn-info btn-block text-white" id="btnUpdate" value="수정">
				<input type="submit" class="btn btn-info btn-block text-white" id="btnInput" value="입력" style="display: none;">
				<a href="delete.do?bno=${dto.bno}" class="btn btn-info btn-block text-white" id="btndelete">삭제</a>
				<a href="javascript:history.go(-1)" class="btn btn-info btn-block text-white" id="btncancle" style="display:none;">취소</a>
				<a href="list.do" class="btn btn-outline-secondary btn-block">목록보기</a>
			</div>
		</form>
	</div>
	<script type="text/javascript">
		let btnUpdate = document.querySelector("#btnUpdate");
		let btnInput = document.querySelector("#btnInput");
		let btitle = document.querySelector("#btitle");
		let bcontent = document.querySelector("#bcontent");
		let btndelete = document.querySelector('#btndelete');
		let btncancle = document.querySelector('#btncancle');
		
		btnUpdate.addEventListener("click",function(){
			btnUpdate.style.display = "none";
			btnInput.style.display = "block";
			btndelete.style.display = "block";
			btncancle.style.display = "none";
			
			btitle.disabled = false;
			bcontent.disabled = false;
		});
	</script>
		<%@ include file="../inc/footer.jsp" %>