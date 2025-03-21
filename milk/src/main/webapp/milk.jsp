<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html  lang="ko">
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<!-- Latest compiled and minified CSS -->
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/css/bootstrap.min.css" rel="stylesheet">

<!-- Latest compiled JavaScript -->
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.3/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<div class="p-5 bg-danger text-white">
  <h1>MILK ORDER Project</h1>
  <p>PreparedStatement Ex</p>
</div><!--  bg-primary(파랑)  danger(빨강)  warning(노랑) dark(블랙) info(하늘색) secondary(회색)  -->
	<!-- 메뉴판 -->
	<div class="container card  my-5">
		<h3 class="card-header "> Milk Order </h3>
		
		  <table class="table table-bordered  table-striped  table-hover table-dark my-5">
		    <caption>우유메뉴</caption>
		    <thead>
		      <tr>
		        <th  scope="col">NO</th>
		        <th  scope="col">NAME</th>
		        <th  scope="col">PRICE</th>
		      </tr>
		    </thead>
		    <tbody>  
		
		
		<%@page import="java.sql.*"%>
		<%
		// select * from milk; - PreparedStatement  
		Connection conn = null;  PreparedStatement pstmt = null;  ResultSet rset = null;
		try{
			//1. 드라이버연동
			Class.forName("com.mysql.cj.jdbc.Driver");
			//2. db연동
			conn = DriverManager.getConnection(
					"jdbc:mysql://localhost:3306/mbasic","root","1234");
			//3. PreparedStatement
			pstmt = conn.prepareStatement("select * from milk");
			rset  = pstmt.executeQuery();  // select   표
			while(rset.next()){ //줄
			//	out.println( rset.getInt("mno")    + "/"  + rset.getString("mname")  + "/" + rset.getInt("mprice")    + "<br/>");
				int mno = rset.getInt("mno");
				String mname = rset.getString("mname");
				int mprice= rset.getInt("mprice") ;
		%>
			<tr>
		        <td><%=mno%></td>
		        <td><%=mname%></td>
		        <td><%=mprice%></td>
		    </tr>
		<%	
			}
			//4. 결과물처리
		}catch(Exception e){e.printStackTrace();
		}
		/* finally{
			if(rset != null){  rset.close();}
			if(pstmt != null){  pstmt.close();}
			if(conn != null){  conn.close();}
		} */
		%>

		    </tbody>
		  </table>		
		 
		
	</div>

<!-- 주문현황 -표 -->
	<div class="container card my-5 bg-warning">
  	<h3 class="card-header bg-warning text-white">MILK ORDER</h3>
	  <table class="table table-striped table-bordered table-hover">
	  	<caption style="caption-side: top">milk 주문현황</caption>
	    <thead>
	      <tr>
	        <th scope="col">NO</th>
	        <th scope="col">NAME</th>
	        <th scope="col">NUM</th>
	        <th scope="col">주문날자</th>
	      </tr>
	    </thead>
	    <tbody>
	    	<%
	    	try{
	    		String sql = "select * from milk_order";
	    		rset = pstmt.executeQuery(sql);
	    		/* while(rset.next()){
	    			int ono = rset.getInt("ono");
	    			String oname = rset.getString("oname");
	    			int onum = rset.getInt("onum");
	    			String odate = rset.getString("odate"); */
	    			while(rset.next()){
	    			out.println("<tr><td>"+rset.getInt("ono")
	    						+"</td><td>"+rset.getString("oname")
	    						+"</td><td>"+rset.getInt("onum")
	    						+"</td><td>"+rset.getString("odate")
	    						+"</td></tr>");
		    	%>
	    <%--   <tr>
	        <td><%=ono%></td>
	        <td><%=oname%></td>
	        <td><%=onum%></td>
	        <td><%=odate%></td>
	      </tr> --%>
	      <%
	      }
	    	}catch(Exception e){e.printStackTrace();
			}finally{
				/* if(rset != null){  rset.close();}
				if(pstmt != null){  pstmt.close();}
				if(conn != null){  conn.close();} */
			}
	      %>
	    </tbody>
	  </table>
	</div>
		
<!-- 주문테이블 -->
	<div class="container card my-5 bg-danger">
		<h3 class="card-header bg-danger text-white">MILK 주문하러가기</h3>
		<div id="accordion">
		<!-- 주문하기 -->
		  <div class="card my-3 bg-info">
		    <div class="card-header">
		      <a class="btn text-white" data-bs-toggle="collapse" href="#collapseOne" style="font-weight: bold">
		        주문하기
		      </a>
		    </div>
		     
		    <div id="collapseOne" class="collapse show" data-bs-parent="#accordion">
		      <div class="card-body">
		        <form action="milk_insert.jsp" method="post" id="orderForm" onsubmit="return orderForm()">
				  <div class="mb-3 mt-3">
				    <label for="email" class="form-label">주문할 우유이름</label>
				    <input type="text" class="form-control" id="ono_input" placeholder="주문할 우유이름을 적어주세요!" name="oname">
				  </div>
				  <div class="mb-3">
				    <label for="pwd" class="form-label">주문할 우유갯수</label>
				    <input type="number" class="form-control" id="onum_input" placeholder="주문할 우유갯수를 적어주세요!" name="onum">
				  </div>
				  <div class="form-check mb-3">
				    <label class="form-check-label">
				    
				    </label>
				  </div>
				  <button type="submit" class="btn btn-danger">주문하기</button>
				</form>
		      </div>
		    </div>
		  </div>
		  <script>
		  		function orderForm(){
		  			let ono = document.querySelector('#ono_input');
		  			let onum = document.querySelector('#onum_input');
		  			
		  			if(ono.value==''){
						alert('빈칸입니다'); return false;
		  			}
		  			if(onum.value==''){
						alert('빈칸입니다'); return false;
		  			}
		  		}
		  </script>
		<!-- 주문수정 -->
		  <div class="card my-3 bg-warning text-white">
		    <div class="card-header">
		      <a class="collapsed btn text-white" data-bs-toggle="collapse" href="#collapseTwo" style="font-weight: bold">
		        주문수정
		      </a>
		    </div>
		    <div id="collapseTwo" class="collapse" data-bs-parent="#accordion">
		      <div class="card-body">
		        <form action="milk_update.jsp" method="get" onsubmit="return updateForm()">
				  <div class="mb-3 mt-3">
				    <label for="ono_update" class="form-label">수정 주문번호</label>
				    <input type="number" class="form-control" id="ono_update" placeholder="수정 주문번호" name="ono">
				  </div>
				  <div class="mb-3">
				    <label for="oname_update" class="form-label">수정 우유이름</label>
				    <input type="text" class="form-control" id="oname_update" placeholder="수정 우유이름" name="oname">
				  </div>
				  <div class="mb-3">
				    <label for="onum_update" class="form-label">수정 우유갯수</label>
				    <input type="number" class="form-control" id="onum_update" placeholder="수정 우유갯수" name="onum">
				  </div>
				  <button type="submit" class="btn btn-danger">수정하기</button>
				</form>
		      </div>
		    </div>
		  </div>
		  <script>
		  		function updateForm(){
		  			let ono = document.querySelector('#ono_update');
		  			let oname = document.querySelector('#oname_update');
		  			let onum = document.querySelector('#onum_update');
		  			
		  			if(ono.value==''){
						alert('빈칸입니다'); return false;
		  			}
		  			if(oname.value==''){
						alert('빈칸입니다'); return false;
		  			}
		  			if(onum.value==''){
						alert('빈칸입니다'); return false;
		  			}
		  		}
		  </script>
		<!-- 주문삭제 -->
		  <div class="card my-3 bg-secondary text-white">
		    <div class="card-header">
		      <a class="collapsed btn text-white" data-bs-toggle="collapse" href="#collapseThree" style="font-weight: bold">
		        주문삭제
		      </a>
		    </div>
		    <div id="collapseThree" class="collapse" data-bs-parent="#accordion">
		      <div class="card-body">
		        <form action="milk_delete.jsp" method="get" onsubmit="return deleteForm()">
				  <div class="mb-3 mt-3">
				    <label for="ono_delete" class="form-label">취소 주문번호</label>
				    <input type="number" class="form-control" id="ono_delete" placeholder="삭제할 우유이름을 적어주세요!" name="ono">
				  </div>
				  <button type="submit" class="btn btn-danger">삭제하기</button>
				</form>
		      </div>
		    </div>
		  </div>
		</div>
	</div>	
	<script>
		  		function deleteForm(){
		  			let ono = document.querySelector('#ono_delete');
		  			
		  			if(ono.value==''){
						alert('빈칸입니다'); return false;
		  			}
		  		}
		  </script>
	<div class="container card my-5">
<!-- 주문수정 -->
	</div>	

	<div class="container card my-5">
<!-- 주문삭제 -->
	</div>	

</body>
</html> 