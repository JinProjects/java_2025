package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BasicController {

	@RequestMapping("/")
	public String basic() {
		return "home.jsp";
	}
	
	@RequestMapping("/basic1.do")
	public String basic1(Model model) {// 처리결과를 Model 객체에 담기
		//1.처리하고
		model.addAttribute("result","sally");
//		return "basic1.jsp";//2. 경로
		return "basic1";//2. 경로 prefix[/] 파일명[basic1] suffix[.jsp]
	}
}
