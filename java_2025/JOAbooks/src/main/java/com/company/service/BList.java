package com.company.service;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BoardDAO;
import com.company.domain.BoardVO;

public class BList implements BoardService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// no 빠진 번호 당기기	
		
		// 1. 언어셋팅 UTF-8
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		ArrayList<BoardVO> list = new ArrayList<BoardVO>();
		// 2. request 데이터 받아오기
		
		// 3. dao list.do
		BoardDAO dao = new BoardDAO();
		list = dao.selectAll();
		// 4. request.setAttribute()
		System.out.println(list);
		request.setAttribute("list", list);
	}

}
