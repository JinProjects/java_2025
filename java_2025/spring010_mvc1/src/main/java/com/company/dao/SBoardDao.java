package com.company.dao;

import java.util.List;

import com.company.dto.SBoardDto;
@MyDao
public interface SBoardDao {
	public int insert(SBoardDto dto);
	public int update(SBoardDto dto);
	public int updateHit(int bno);
	public int delete(int bno);
	public SBoardDto selectOne(int bno);
	public List<SBoardDto> selectAll();
}
