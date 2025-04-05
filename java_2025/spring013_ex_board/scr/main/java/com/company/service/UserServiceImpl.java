package com.company.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.company.dao.UserDao;
import com.company.dto.UserDto;

@Service
public class UserServiceImpl implements UserService{
	@Autowired
	UserDao dao;
	
	public int insert(UserDto dto) {return dao.insert(dto);}
	public int update(UserDto dto) {return dao.update(dto);}
	public int delete(int no) {return dao.delete(no);}
	public UserDto selectOne(int no) {return dao.selectOne(no);}
	public List<UserDto> selectAll() {return dao.selectAll();}
}
