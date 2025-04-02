package com.company.dao;

import java.util.List;

import com.company.dto.BMemberDto;
@MyDao
public interface BMemberDao {
	public int insert(BMemberDto dto);
	public int update(BMemberDto dto);
	public int delete(BMemberDto dto);
	public BMemberDto selectOne(BMemberDto dto);
	public List<BMemberDto> selectAll();
}
