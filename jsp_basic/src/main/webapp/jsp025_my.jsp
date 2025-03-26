<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <!-- jsp022_header.jsp -->
    <!-- jsp022_header.jsp -->
    <!-- jsp022_header.jsp -->
<%-- <%@ include file="jsp022_header.jsp" %> --%>

<!-- navbar -->
<!-- navbar -->
	<div class="d-flex">
		<%
			String uid = (String)session.getAttribute("userId");
			String[] chkbox = request.getParameterValues("chkbox");
			
			out.println(chkbox);
			if(uid != null){
				out.println("<p class='me-2'>"+uid+"</p>");
			}else{
				out.println("<script>alert('정보를 확인해주세요~');</script>");
			}
			
		%>
		<a href="jsp022_logout_action.jsp" class="me-2">logout</a>
	</div>
	<div class="container card my-5">
		<h3 class="card-header"></h3>
		<table class="table table-striped bg-info">
			<tr><th>NO</th><td></td></tr>
			<tr><th>NAME</th><td></td></tr>
			<tr><th>PASS</th><td></td></tr>
		</table>
	</div>
