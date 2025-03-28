<%@page import="java.util.Iterator"%>
<%@page import="com.company.domain.BoardVO"%>
<%@page import="java.util.ArrayList"%>
<%@page import="com.company.dao.BoardDAO"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
	<%@ include file="../inc/header.jsp" %>
	<div class="container card my-5">
		<h3> NAVER BOOK</h3>
		<div class="result">
			
		</div>
		<script type="text/javascript">
		// 방법 1. window.onload = function(){}; //브라우저 로딩되면 동작 	
		// - el $() - jQuery
		// 방법 2. 
		$(function(){
			alert("hi");
			$.ajax({
				url:"${pageContext.request.contextPath}/books",
				dataType:"json",
				type: "get",
				success: function(json){ //Object
					//1. 데이터 분해
					//console.log(json);
					let items = json.items;
					//console.log(items[0]);
						for(let i=0; i<items.length; i++){
							let div = $('<div class="row my-3">'); //<div></div> 태그만들기
							let p1 = $('<div class="col-sm-4 naverimg">').
										html('<img src="'+items[i].image+'" style="width:100%" />'); 
							let p2 = $('<div class="col-sm-8">').html(
									'<a href="'+items[i].link + '"><p>'+ items[i].title
													+"</p><p>"+ items[i].author		
													+"</p><p>"+ items[i].pubdate		
													+"</p><p>"+ items[i].price	
													+"</p></a>"); //html reset해서 넣기 
							div.append(p1).append(p2); //div태그안에 p1추가하고 p2추가
							$(".result").append(div);
						}
					//2. 보여줄화면에 끼워넣기
					},
				error:function(xhr, textstatus,errorThrown){
					$(".result").html(textstatus + "(HTTP-" +xhr.status + "/" + errorThrown);
				}//$(".result") 같은 뜻 document.querySelector(".result ")
			});
		})// jQuery 브라우저 로딩되면 동작
		</script>
	</div>
	
	<div class="container card my-5">
		<h3 class="">MULTIBOARD</h3>
		<table class="table table-striped">
		<caption style="caption-side: top">MULTIBOARD-MVC1</caption>
	    <thead>
	      <tr>
	        <th scope="col">NO</th>
	        <th scope="col">NO</th>
	        <th scope="col">TITLE</th>
	        <th scope="col">WRITER</th>
	        <th scope="col">DATE</th>
	        <th scope="col">HIT</th>
	      </tr>
	    </thead>
	    <tbody>
	    	<c:forEach  var="dto" items="${list}" varStatus="status">
	    		<tr>
	    			<td>${list.size() - status.index}</td>
	    			<td>${list.size() - status.index}</td>
	    			<td><a href="detail.do?bno=${dto.bno}">${dto.btitle}</a></td>
	    			<td>${dto.bname }</td>
	    			<td>${dto.bdate }</td>
	    			<td>${dto.bhit }</td>
	    		</tr>
	    	</c:forEach>
	    </tbody>
	  </table>
	  	<p class="text-end"><a href="write_view.do" class="btn btn-info text-white ">글쓰기</a></p>
		</div>
	</div>
	<%@ include file="../inc/footer.jsp" %>