package com.company.boot001.dto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	@RequestMapping("/test1")
	@ResponseBody // 뷰 페이지 만들지 않고 정보만 넘김 json 
	public String basic1() {
		return "hello";
	}
	// localhost:8181/boot1/test1
	
	@RequestMapping("/test2")
	public String basic2(Model model) {
		model.addAttribute("greeting","hello");
		return "test2";
	}
	@RequestMapping("/test3")
	public String basic3() {
		return "test3";
	}
}
