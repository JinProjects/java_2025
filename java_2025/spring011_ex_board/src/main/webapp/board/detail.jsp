<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="UTF-8"%>%>
<%@ include file="../inc/header.jsp" %>
<%@page import="java.sql.*"%>
<%
request.setCharacterEncoding("UTF-8");
%>
<div class="container"  style="margin-top:5%; min-height:500px">
	<h3>MULTIBOARD 상세보기</h3> 					
	<div class="panel" >
	  <div  class="panel-body"> 
  		<span class="glyphicon glyphicon-plus">  조회수</span>    <p>${b.bhit}</p>
	</div>	
	</div>	
	<div class="panel"  >
	  <div  class="panel-body">
	  		<span class="glyphicon glyphicon-plus">  이름</span> <p>${b.bname}</p>
		</div>
	</div>				
	<div class="panel"  >
	  <div  class="panel-body">
	  	<span class="glyphicon glyphicon-plus">  제목</span> <p>${b.btitle}</p>
	  </div>	
	</div>
	<div class="panel"  >
	  <div  class="panel-body">
	  	<span class="glyphicon glyphicon-plus">  내용</span> <textarea  class="form-control">${b.bcontent}</textarea>
	  </div> 
	</div>	
	<div class="text-right"    >
		 <a href="<%=request.getContextPath()%>/edit.do?bno=${b.bno}"  class="btn btn-danger" >수정</a> 
		 <a href="<%=request.getContextPath()%>/delete.do?bno=${b.bno}"  class="btn btn-danger" >삭제</a>    
		 <a href="<%=request.getContextPath()%>/list.do"  class="btn btn-info" >목록보기</a> 
	</div>						 
</div>	
<%@ include file="../inc/footer.jsp" %>
