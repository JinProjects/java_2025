package com.company.controller;

import java.net.InetAddress;
import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.company.dao.SBoardDao;
import com.company.dto.SBoardDto;
import com.company.service.BoardService;

@Controller
@RequestMapping("/board")
public class SBoardController {
	@Autowired
	BoardService service;
	
	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public String list(Model model) {
		model.addAttribute("list", service.selectAll()); 
		return "board/list";
	}
	@RequestMapping(value = "/write_view.do", method = RequestMethod.GET)
	public String write(Model model) {
		 
		return "board/write";
	}
	@RequestMapping(value = "/write.do", method = RequestMethod.POST)
	public String write_post(SBoardDto dto,RedirectAttributes rttr) throws Exception {
		String ip = InetAddress.getLocalHost().getHostAddress();
		dto.setBip(ip);
		String result = "fail";
		if(dto != null && service.insert(dto) > 0 ) {
			//service.insert(dto);
			result = "success";
		}
		rttr.addFlashAttribute("result",result);
		return "redirect:list.do";
	}
	
	
	@RequestMapping(value = "/detail.do", method = RequestMethod.GET)
	public String detail(int bno, Model model) {
		model.addAttribute("dto", service.detail(bno));
		return "board/detail";
	}
	@RequestMapping(value = "/insert.do", method = RequestMethod.GET)
	public String create_post(SBoardDto dto, RedirectAttributes rttr) throws Exception {
		String ip = InetAddress.getLocalHost().getHostAddress();
		dto.setBip(ip);
		String result = "fail";
		if(dto != null && service.insert(dto) > 0 ) {
			//service.insert(dto);
			result = "success";
		}
		rttr.addFlashAttribute("result",result);
		return "redirect:list.do";
		// RedirectAttributes rttr
		// : view페이지에 redirect한 결과를 넘겨주는 방법
		// board/list.jsp 파일에서 result 한 결과를 알림창 한번 실행
		//
	}
	@RequestMapping(value = "/edit_view.do", method = RequestMethod.GET)
	public String edit(Model model, int bno) {
		model.addAttribute("dto", service.updateForm(bno)); 
		return "board/edit";
	}
	@RequestMapping(value = "/edit.do", method = RequestMethod.POST)
	public String edit_post(SBoardDto dto) {
		if(dto != null) {
			service.update(dto);
		}
		return "redirect:/board/detail.do?bno="+dto.getBno();
	}
	// 글 삭제폼 				,view { board/delete }
//	@RequestMapping(value = "/delete_view.do", method = RequestMethod.GET)
//	public String delete() {
//		return "board/delete";
//	}
	@RequestMapping(value = "/delete.do", method = RequestMethod.GET)
	public String delete_post(SBoardDto dto) {
		if(dto != null) {
			service.delete(dto);
		}
		return "redirect:/board/list";
	}
}
