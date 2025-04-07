package com.company.boot001.dto;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class UserController {
	@RequestMapping("/ex1")
	@ResponseBody
	public String test() {
		return "springboot";
	}
	//@RequestMapping("/ex2")
	@GetMapping("/ex2")
	public String test2(Model model) {
		model.addAttribute("greeting", "ex2");
		return "test1";
	}
}
