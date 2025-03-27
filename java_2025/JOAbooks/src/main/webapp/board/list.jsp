<%@page import="com.company.domain.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.company.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ include file="../inc/header.jsp" %>
	<div class="container card my-5">
		<h3 class="">MULTIBOARD</h3>
	<div>
		<table class="table table-striped">
		<caption style="caption-side: top">MULTIBOARD-MVC1</caption>
	    <thead>
	      <tr>
	        <th scope="col">NO</th>
	        <th scope="col">TITLE</th>
	        <th scope="col">WRITER</th>
	        <th scope="col">DATE</th>
	        <th scope="col">HIT</th>
	      </tr>
	    </thead>
	    <tbody>
	    <%
	    	ArrayList<BoardVO> list = null;
			BoardDAO dao = new BoardDAO();
	    		list = dao.selectAll();
	    		for(BoardVO b : list){
	    %>
	      <tr>
	        <td><%=b.getBno() %></td>
	        <td><a href="/detail.do?bno=<%=b.getBno() %>"><%=b.getBtitle() %></a></td>
	        <td><%=b.getBname() %></td>
	        <td><%=b.getBdate()%></td>
	        <td><%=b.getBhit() %></td>
	      </tr>
	      <%} %>
	    </tbody>
	  </table>
	  <div>
	  	<a href="/write.do" class="btn btn-info text-white ">글쓰기</a>
	  </div>
		</div>
	</div>
	<%@ include file="../inc/footer.jsp" %>