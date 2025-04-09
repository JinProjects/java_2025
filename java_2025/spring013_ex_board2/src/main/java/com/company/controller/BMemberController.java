package com.company.controller;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.company.dto.BMemberDto;
import com.company.service.BMemberService;

@Controller
@RequestMapping("/member")
public class BMemberController {
	@Autowired
	BMemberService service;
	
	@RequestMapping(value="/login.do",method = RequestMethod.GET)
	public String login() {
		
		return "member/login";
	}
	@RequestMapping(value="/login_post.do",method = RequestMethod.POST)
	public String login_post(BMemberDto dto,ModelAndView mav,Model model, HttpServletRequest request, HttpServletResponse response) throws IOException {
		int cnt = service.memberLogin(dto);
		StringBuffer sb = new StringBuffer();
		String result = "";
		if(cnt > 1) {
			result = "다시 확인바랍니다.";
		}else {
			HttpSession session = request.getSession();
			session.setAttribute("mid", dto.getMid());
			session.setMaxInactiveInterval(60*3);
			result = "로그인 성공";
		}
		model.addAttribute("result",result);
		return "redirect:";
	}
	@RequestMapping(value="/findId.do",method = RequestMethod.GET)
	public String findId() {
		
		return "member/login";
	}
	@RequestMapping(value="/findPw.do",method = RequestMethod.GET)
	public String findPw() {
		
		return "member/login";
	}
}
