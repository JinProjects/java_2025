<%@page import="org.apache.commons.collections4.bag.SynchronizedSortedBag"%>
<%@page import="com.company.domain.BoardVO"%>
<%@page import="com.company.dao.BoardDAO"%>
<%@page import="java.sql.Connection"%>
<%@page import="javax.sql.DataSource"%>
<%@page import="javax.naming.InitialContext"%>
<%@page import="javax.naming.Context"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
	<%@ include file="inc/header.jsp" %>
	<div class="container card my-5">
		<h3 class="card-header">hello</h3>
		<ol>
			<li>project 생성</li>
			<li> [inc]-header.jsp/footer.jsp </li>
			<li> [inc]-error404.jsp/error500.jsp , [WEB-INF]-web.xml</li>
		</ol>
		<h4>error</h4>
		<%-- <a href="no">없는페이지</a>
		<%=null %> --%>
		<h4>DBCP</h4>
		<%-- <%
			Connection conn = null;
			Context initContext = new InitialContext(); // server.xml 파일에 Context resource 찾겠다. 
	        Context envContext  = (Context)initContext.lookup("java:/comp/env"); // 환경 Context
	        DataSource ds         = (DataSource)envContext.lookup("jdbc/mbasic"); //pool 이름 
	        conn = ds.getConnection(); // db연동
	        out.println("db연동");
		%> --%>
		<div class="container card my-5">
			<h3 class="card-header"> PROJECT (2) MODEL</h3>
			<pre>
			1. Dto			:  [com.company.domain] - BoardVO private
			2. DBManager    :  [com.company.dbmanager] - DBManager
			2. Dao    :  [com.company.dao] - BoardDAO 
			</pre>
			<%
				BoardDAO dao = new BoardDAO();
			BoardVO vo = new BoardVO();
			vo.setBtitle("제목-new");
			vo.setBcontent("내용-new");
			vo.setBno(3);
			
			//6.delete
			System.out.println(dao.delete(3));
			System.out.println(dao.select(3));
			
			//5. update
			
			System.out.println(dao.update(vo));
			System.out.println(dao.select(3));
			
			//4. updateHit
			System.out.println(dao.updateHit(3));
			//3. select
			System.out.println(dao.select(3));
			
			//2. insert( BoardVO vo ) - btitle, bcontent, bname
			/* BoardVO vo = new BoardVO();
			vo.setBtitle("첫번째 문의드려요!");
			vo.setBcontent("내용");
			vo.setBname("first");
			System.out.println(dao.insert(vo));
			System.out.println( dao.selectAll() ); */
			//1. selectAll	
			%>
			<ol>
				<li>DB  : table</li>
				<li>Dto : </li>
				<li>Dao : </li>
				<li>Test: </li>
			</ol>
		</div>
	</div>
	<div>
		<h3> PROJECT (3) VIEW</h3>
		<pre>
		[webapp] - [board]
					ㄴlist.jsp
					ㄴwrite.jsp
					ㄴdetail.jsp
					ㄴupdate.jsp
		1.markup
		2.validator - 오류검사
		3.빈칸검사
		</pre>
	</div>
	<%@ include file="inc/footer.jsp" %>
