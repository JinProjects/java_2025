<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
						//세션저장이름, 값
	session.invalidate();

	//response.sendRedirect("jsp021_session1.jsp");
	out.println("<script>location.href='jsp021_session1.jsp';</script>");
%>