package com.company.service.board;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.company.dao.BoardDAO;
import com.company.domain.BoardVO;

public class BWrite implements BoardService {

	@Override
	public void exec(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//1. utf-8
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		int num = 0;
		int bno = 0;
		//2. request 데이터
		String btitle = request.getParameter("btitle");
		String bcontent = request.getParameter("bcontent");
		String bname = request.getParameter("bname");
		
		//3. dao insert 처리
		BoardDAO dao = new BoardDAO();
		BoardVO vo = new BoardVO();
		vo.setBtitle(btitle);
		vo.setBcontent(bcontent);
		vo.setBname(bname);

		//4. 결과물
		request.setAttribute("result", String.valueOf(dao.insert(vo)));
	}

}
