package com.company.service.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BoardDAO;
import com.company.domain.BoardVO;

public class BDetail implements BoardService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		BoardDAO dao = new BoardDAO();
		BoardVO vo = new BoardVO(); 
		int bno = Integer.parseInt(request.getParameter("bno"));
		vo = dao.select(bno);
		dao.updateHit(bno); 
		request.setAttribute("boardVO", vo);
		request.setAttribute("result", vo);
		
	}

}
