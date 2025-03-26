<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	session.invalidate();
	//ver-1
	/* out.println("<script>alert('로그아웃합니다.'); location.href='jsp022_login.jsp';</script>"); */
	
	//ver-2 알림창 처리 불가
	/* out.println("<script>alert('로그아웃합니다.');</script>");
	response.sendRedirect("jsp022_login.jsp"); */

	//ver-3      http-equiv='refresh' 새로고침 / 
	//			  content='초; url=경로' 몇초뒤에 넘어가라
	out.println("<meta http-equiv='refresh' content='2; url=jsp022_login.jsp' /> ");
	
	//sendRedirect 와 dispatcher의 차이점
	//sendRedirect는 페이지를 이동만 시킨다 (request,response) 유지 안됨
	//dispatcher는 request,response 데이터를 같이 보낸다. 
%>