package com.company.service;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BoardDAO;
import com.company.domain.BoardVO;

public class BEdit implements BoardService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		int bno = Integer.parseInt(request.getParameter("bno"));
		
		BoardDAO dao = new BoardDAO();
		BoardVO vo = new BoardVO();
		vo.setBtitle(btitle);
		vo.setBcontent(bcontent);
		vo.setBno(bno);
		
		request.setAttribute("result", String.valueOf(dao.update(vo)));
		
	}

}
