<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
						//세션저장이름, 값
	session.setMaxInactiveInterval(10*60); //10분 설정
	session.setAttribute("username", "sally"); 
	session.setAttribute("userage", "10");
	
	response.sendRedirect("jsp021_session1.jsp");
%>