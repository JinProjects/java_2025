<%@page import="jsp_basic.Servlet001"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div class="container card my-5">
		<h3 class="card-header">001. el { 표현식 }</h3>
		<p><% out.println("hello"); %></p>
		<p><%="hello" %></p>
		<p>${"hello"} ${1} ${3.14} ${'A'} ${'ABC'}</p>
		<p><a href="jsp027_result.jsp?name=sally">PARAM</a></p>
		<% Servlet001 s = new Servlet001(1,2); 
			//pageContext.setAttribute("s", s);
			request.setAttribute("s", s);
		%>
		${s.a }
	</div>
	<div class="container card my-5">
		<h3 class="card-header">002. jstl - if </h3>
		<c:if test="${1>20 }">1은 20보다 작다</c:if>
		<hr/>
		<h3 class="card-header">002. jstl - for </h3>
		<%
			String[] movie = {"범죄의도시","조커","분노의 질주","알라딘"};
			pageContext.setAttribute("movie",movie);
			for(String m : movie){
				out.println(m);
			}
		%>
		<hr/>
		<c:forEach var="m" items="${movie}" varStatus="status">
			${status.index } = ${m } <br/>
		</c:forEach>
	</div>
</body>
</html>