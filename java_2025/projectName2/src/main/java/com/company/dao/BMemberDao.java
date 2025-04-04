package com.company.dao;

import java.util.List;

import com.company.dto.BMemberDto;

@MyDao
public interface BMemberDao {
	public BMemberDto selectOne(BMemberDto dto);
	public List<BMemberDto> selectAll();
	public int delete(BMemberDto dto);
	public int update(BMemberDto dto);
	public int insert(BMemberDto dto);
	public int memberLogin(BMemberDto dto);
}
