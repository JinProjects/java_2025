package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.SBoardDao;
import com.company.dto.SBoardDto;

@Service
public class BoardServiceImpl implements BoardService{
	@Autowired
	SBoardDao dao;
	
	@Override
	public List<SBoardDto> selectAll() {
		return dao.selectAll();
	}

	@Override
	public int insert(SBoardDto dto) {
		return dao.insert(dto); //글쓰기 기능
	}

	@Override
	public int update(SBoardDto dto) {
		return dao.update(dto); //수정기능
	}
	@Override
	public SBoardDto updateForm(int bno) {
		return dao.select(bno); //수정기능
	}

	@Override
	public int delete(SBoardDto dto) {
		return dao.delete(dto);
	}
	@Override
	public SBoardDto detail(int bno) {
		dao.updateHit(bno);
		return dao.select(bno);
	}

}
