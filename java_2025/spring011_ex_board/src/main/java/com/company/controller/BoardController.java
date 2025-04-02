package com.company.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.dao.SBoardDao;
import com.company.dto.SBoardDto;

@Controller
@RequestMapping("/board")
public class BoardController {
	@Autowired
	SBoardDao sboardDAO;
	SBoardDto sboardDTO = new SBoardDto();
	
	@RequestMapping(value ="/list.do", method = RequestMethod.GET)
	public String list(Model model) {
		
		List<SBoardDto> list = sboardDAO.selectAll();
		model.addAttribute("list", list);
		return "board/list";
	}
	@RequestMapping(value="/write_view.do", method = RequestMethod.GET)
	public String write() {
		return "board/write";
	}
	@RequestMapping(value="/detail.do", method = RequestMethod.GET)
	public String detail(Model model, HttpServletRequest request, HttpServletResponse response) {
		int bno = Integer.parseInt(request.getParameter("bno"));
		sboardDTO = sboardDAO.selectOne(bno);
		model.addAttribute("b", sboardDTO);
		return "board/detail";
	}
	@RequestMapping(value="/edit.do", method = RequestMethod.POST)
	public String edit() {
		return "board/edit";
	}
	@RequestMapping(value="/delete.do",method = RequestMethod.GET)
	public String delete() {
		return "board/delete";
	}
}
/*
@Controller
public class BoardController_ver1 {
	@Autowired
	SBoardDao sboardDAO;
	SBoardDto sboardDTO = new SBoardDto();
	
	@RequestMapping("/")
	public String test(Model model) {
		model.addAttribute("name","gildong");
		return "basic";
	}
	
	@RequestMapping("/board/list.do")
	public String list(Model model) {
		
		List<SBoardDto> list = sboardDAO.selectAll();
		model.addAttribute("list", list);
		return "board/list";
	}
	@RequestMapping("/board/write_view.do")
	public String write() {
		return "board/write";
	}
	@RequestMapping("/board/detail.do")
	public String detail(Model model, HttpServletRequest request, HttpServletResponse response) {
		int bno = Integer.parseInt(request.getParameter("bno"));
		sboardDTO = sboardDAO.selectOne(bno);
		model.addAttribute("b", sboardDTO);
		return "board/detail";
	}
	@RequestMapping("/board/edit.do")
	public String edit() {
		return "board/edit";
	}
	@RequestMapping("/board/delete.do")
	public String delete() {
		return "board/delete";
	}
}
*/