package com.company.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class BMemberController {
	
	@RequestMapping(value="")
	public String selectOne() {
		return "";
	}
}
