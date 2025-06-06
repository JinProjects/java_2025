<%@page import="java.net.InetAddress"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%
	//1. utf-8 설정
	request.setCharacterEncoding("UTF-8");

	//2. request.getParameter() 이용해서 데이터받기
	String oname = request.getParameter("oname");
	int onum = Integer.parseInt(request.getParameter("onum"));
	
	out.println(oname + "/" + onum);
	Connection conn = null; PreparedStatement pstmt = null;
	String sql ="insert into milk_order (oname,onum,oip) value(?,?,?); ";
	
	try{
	//3. Driver 연동
	Class.forName("com.mysql.cj.jdbc.Driver");
	//4. DB연동
	conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mbasic","root","1234");
	out.println("<br>DB연동 성공"+conn);
	//5. PreparedStatment 이용해서 sql처리
	pstmt = conn.prepareStatement(sql); //##
	pstmt.setString(1, oname); // 1. oname 첫번째 물음표, 값
	pstmt.setInt(2, onum);// 				두번째 물음표, 값
	pstmt.setString(3, InetAddress.getLocalHost().getHostAddress()); // ip
	
	//6. 결과값 받아서 처리
	int result = pstmt.executeUpdate(); // sql - INSERT, UPDATE or DELETE; 실행줄수
	
	if(result > 0){
		out.println("<script>alert('주문성공!'); location.href='milk.jsp';</script>");
	}else{ 
		out.println("<script>alert('관리자에게 문의 바랍니다.'); location.href='milk.jsp';</script>");
	}
	
	}catch(Exception e){
		e.printStackTrace();
	}finally{
		if(pstmt != null){pstmt.close();}	
		if(conn != null){conn.close();}	
	}
%>