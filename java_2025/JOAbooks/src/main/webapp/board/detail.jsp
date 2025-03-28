<%@page import="com.company.domain.BoardVO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="../inc/header.jsp"%>
<%
	BoardVO vo = (BoardVO)request.getAttribute("result");
%>
<div class="container card  my-5  p-3">
	<h3>MULTIBOARD 상세보기</h3>
	<div class="my-3">
		<div class="">
			<span><i class="bi bi-book-half"></i> 조회수</span>
			<p>${boardVO.bhit }</p>
		</div>
	</div>
	<div class="my-3">
		<div class="">
			<span><i class="bi bi-book-half"></i> 이름</span>
			<p>${boardVO.bname}</p>
		</div>
	</div>
	<div class="my-3">
		<div class="">
			<span><i class="bi bi-book-half"></i> 제목</span>
			<p>${boardVO.btitle }</p>
		</div>
	</div>
	<div class="my-3">
		<div class="">
			<span><i class="bi bi-book-half"></i> 내용</span>
			<textarea class="form-control" readonly>${boardVO.bcontent}</textarea>
		</div>
	</div>
	<div class="text-end">
		<a href="edit_view.do?bno=${boardVO.bno}" class="btn btn-primary">수정</a> 
		<a href="delete.do?bno=${boardVO.bno}" class="btn btn-outline-primary">삭제</a> 
		<a href='list.do' class="btn btn-outline-primary">목록보기</a>
	</div>
</div>

<%@ include file="../inc/footer.jsp"%>