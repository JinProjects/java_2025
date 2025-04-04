package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.BMemberDao;
import com.company.dto.BMemberDto;
@Service
public class BMemberServiceImpl implements BMemberService {
	@Autowired
	BMemberDao dao;
	
	@Override
	public BMemberDto selectOne(BMemberDto dto) {
		return dao.selectOne(dto);
	}

	@Override
	public List<BMemberDto> selectAll() {
		return dao.selectAll();
	}

	@Override
	public int delete(BMemberDto dto) {
		// TODO Auto-generated method stub
		return dao.delete(dto);
	}

	@Override
	public int update(BMemberDto dto) {
		// TODO Auto-generated method stub
		return dao.update(dto);
	}

	@Override
	public int insert(BMemberDto dto) {
		// TODO Auto-generated method stub
		return dao.insert(dto);
	}

	@Override
	public int memberLogin(BMemberDto dto) {
		// TODO Auto-generated method stub
		return dao.memberLogin(dto);
	}

}
