package com.company.dao;

import java.util.List;

import com.company.dto.SBoardDto;

@MyDao
public interface SBoardDao {
	public List<SBoardDto> selectAll();
	public SBoardDto select(int bno);
	public int insert(SBoardDto dto);
	public int update(SBoardDto dto);
	public int updateHit(int bno);
	public int delete(SBoardDto dto);
	public SBoardDto detail(int bno);
}
