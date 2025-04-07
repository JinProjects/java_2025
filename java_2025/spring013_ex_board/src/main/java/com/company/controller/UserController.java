package com.company.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.company.dto.UserDto;
import com.company.service.UserService;

@Controller
public class UserController {
	@Autowired
	UserService service;
	
	//@GetMapping("/list.user") //상위버전에서 사용
	@RequestMapping(value = "/list.users", method = RequestMethod.GET)
	public String list(Model model,HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//처리하고
		model.addAttribute("list", service.selectAll());
		return "users/list"; //화면
	}
	  // detail.user - Get  방식  해당번호의 사용자정보  users/select.jsp 파일 
	   // insert.user - Post 방식  글쓰기기능         , list.user
	   // update.user - Post 방식  글수정기능         , list.user
	   // delete.user - Get  방식  삭제기능           , list.user 
	@RequestMapping(value="/detail.users", method = RequestMethod.GET)
	public String detail(Model model, int no) throws Exception {
		//처리하고
		model.addAttribute("dto",service.selectOne(no));
		return "users/select"; //화면
	}
	@RequestMapping(value="/insert.users",method = RequestMethod.POST)
	public String insert(UserDto dto,HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("UTF-8");
		response.setContentType("text/html;charset=UTF-8");
		//처리하고
		if(dto != null) {
			System.out.println(dto.toString());
			service.insert(dto);
		}
		return "redirect:/list.users"; //화면
	}
	@RequestMapping(value="/update.users",method = RequestMethod.POST)
	public String update(UserDto dto,Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		if(dto != null) {
			service.update(dto);
		}
		//처리하고
		return "redirect:/list.users"; //화면
	}
	@RequestMapping(value="/delete.users",method = RequestMethod.GET)
	public String delete(int no,Model model, HttpServletRequest request, HttpServletResponse response) throws Exception {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html;charset=utf-8");
		System.out.println(no);
		if(no != 0) {
			service.delete(no);
		}
		//처리하고
		return "redirect:/list.users"; //화면
	}
	
}