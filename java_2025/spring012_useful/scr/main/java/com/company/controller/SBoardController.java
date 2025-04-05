package com.company.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.dao.SBoardDao;

@Controller
@RequestMapping("/board")
public class SBoardController {
	@Autowired
	SBoardDao dao;
	
	@RequestMapping(value = "/list.do", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("list", dao.selectAll()); 
		return "board/list";
	}
	@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	public String insert(Model model) {
		model.addAttribute("list", dao.selectAll()); 
		return "board/index";
	}
	@RequestMapping(value = "/update.do", method = RequestMethod.GET)
	public String update(Model model) {
		model.addAttribute("list", dao.selectAll()); 
		return "board/index";
	}
	@RequestMapping(value = "/updateHit.do", method = RequestMethod.GET)
	public String updateHit(Model model) {
		model.addAttribute("list", dao.selectAll()); 
		return "board/index";
	}
	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	public String delete(Model model) {
		model.addAttribute("list", dao.selectAll()); 
		return "board/index";
	}
}
