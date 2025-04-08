package com.company.boot003.board;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.company.boot003.jpa.Board;

import lombok.RequiredArgsConstructor;

@Controller
@RequiredArgsConstructor
public class BoardController {
	
	//ver-1 생성자 생성
	//@Autowired BoardService service;
	//ver-2 
	private final BoardService service;
	
	@GetMapping("/board/list")
	public String list(Model model){
		//전체리스트 뽑음
		model.addAttribute("list",service.findAll());
		return "board/list"; // board폴더안에 list파일
	}
	@GetMapping("/board/test")
	public String test(Model model){
		//전체리스트 뽑음
		
		return "test"; // board폴더안에 list파일 
	}
	//@PathVariable 버전에 따라 오류 날 수 있음 
	@GetMapping("/board/detail/{id}")
	public String detail(@PathVariable Long id, Model model){
		//조회수올리고 / 상세보기기능 
		model.addAttribute("dto",service.find(id));
		return "board/detail"; // board폴더안에 list파일 
		//http://localhost:8181/board/detail/2
	}
	@GetMapping("/board/insert")
	public String insert_get(){
		
		return "board/write"; // board폴더안에 list파일 
		//http://localhost:8181/board/detail/1
	}//글쓰기 폼 
	@PostMapping("/board/insert")
	public String insert_post(Board board , @RequestParam Long member_id) throws Exception{
		System.out.println("......:"+board);
		System.out.println("......:"+member_id);
		service.insert(board);
		return "redirec:/board/list"; // board폴더안에 list파일 
		//http://localhost:8181/board/detail/2
	}//글쓰기 기능
	
	@PostMapping("/board/update")
	//@RequestMapping(value="/board/update",method = RequestMethod.POST)
	public String update_post(Board board){
		service.update(board);
		return "redirect:/board/list"; // board폴더안에 list파일 
		//http://localhost:8181/board/update
	}//글수정 기능
	@GetMapping("/board/update_view/{id}")
	public String update_get(@PathVariable Long id, Model model){
		// 수정할 글 가져오기
		
		model.addAttribute("dto",service.update_view(id));
		
		return "board/edit"; // board폴더안에 list파일 
		//http://localhost:8181/board/update/2
	}//글수정 폼 
	
	@GetMapping("/board/delete")
	public String delete_get(Board board){
		// 삭제할 글 가져오기
		service.delete(board);
		return "board/delete"; // board폴더안에 list파일 
		//http://localhost:8181/board/delete/1
	}//글삭제 폼 
	@PostMapping(value = "/board/delete")
	public String delete_post(Board board){
		return "redirec:/board/list"; // board폴더안에 list파일 
		//http://localhost:8181/board/detail/1
	}//글삭제 기능
	/*
		Restful API
		기존게시판 : localhost:8181/board/detail?bno=10 쿼리스트링 
		Restful API : localhost:8080/board/detail/bno/10 쿼리스트링 
			1) restful - http url을 기반으로 자원에 접근해서 서비스를 제공하는 애플리케이션
			2) api - 기능제공
			3) method(GET : 검색 / POST : 생성(insert)  / PATCH(선호함,부분업데이트), PUT(전체업데이트) / DELETE(삭제))
			4) DATA - json, xml
			
	*/
	
	
}
