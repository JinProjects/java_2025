package com.company.service;

import java.util.List;

import com.company.dto.SBoardDto;

public interface BoardService {
	public List<SBoardDto> selectAll(); 
	public int insert(SBoardDto dto);//글쓰기기능
	public int update(SBoardDto dto);//수정기능
	public int delete(SBoardDto dto);//글 삭제기능 
	public SBoardDto updateForm(int bno);
	public SBoardDto detail(int bno);
}
