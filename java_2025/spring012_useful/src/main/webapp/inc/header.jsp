<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="contextPath" value="${pageContext.request.servletContext}" />
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<title>title</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
<!-- jQuery library -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.7.1/jquery.min.js"></script>

<link rel="stylesheet" href="https://cdn.jsdelivr.net/npm/bootstrap-icons@1.11.3/font/bootstrap-icons.min.css">
<style type="text/css">
	* {
		/* 한글 가로 변경 */
		white-space:nowrap; 
	}

</style>
</head>
<body>
	<nav class="navbar navbar-expand-sm navbar-dark bg-dark">
  <div class="container-fluid">
    <a class="navbar-brand" href="javascript:void(0)">Logo</a>
    <button class="navbar-toggler" type="button" data-bs-toggle="collapse" data-bs-target="#mynavbar">
      <span class="navbar-toggler-icon"></span>
    </button>
    </div>
    <div class="collapse navbar-collapse justify-content-start" id="mynavbar">
      <ul class="navbar-nav me-auto">
        <li class="nav-item">
          <a class="nav-link" href="javascript:void(0)">Link</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="javascript:void(0)">Link</a>
        </li>
        <li class="nav-item">
          <a class="nav-link" href="javascript:void(0)">Link</a>
        </li>
      </ul>
      <div class="container-fluid justify-content-end">
	  	<ul class="navbar-nav me-auto">
	  		<%-- <c:when test="${isLoginFailed == false && bmember!=null}" > --%>
	  			<%-- <li class="nav-item">	
		        	<a class="nav-link" href="${contextPath}/member/member_info.do">${mid}님 반갑습니다!</a>
		        </li>
		        <li class="nav-item">
		        	<a class="nav-link" href="${contextPath}/member/logout.do">로그아웃</a>
		        </li> --%>
	        <%-- </c:when>
	        <c:otherwise> --%>
		    	<li class="nav-item">
		        	<p><a class="nav-link px-5" href="${contextPath}/member/login_view.do">로그인</a></p>
		        </li>
		        <li class="nav-item">
		        	<a class="nav-link px-5" href="${contextPath}/member/join_view.do">회원가입</a>
		        </li>
	        <%-- </c:otherwise> --%>
	    </ul>
        <!-- <input class="form-control me-2" type="text" placeholder="Search"> -->
        <!-- <button class="btn btn-primary" type="button">Search</button> -->
    </div>
  </div>
</nav>
