package com.company.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.dto.BMemberDto;
public class BMemberDaoImpl implements BMemberDao {
	@Autowired
	SqlSession sqlSession;
	
	private static final String namespace = "com.company.dao.BMemberDao"; 
	@Override
	public int insert(BMemberDto dto) {
		return sqlSession.insert(namespace+".insert",dto);
	}

	@Override
	public int update(BMemberDto dto) {
		return sqlSession.update(namespace+".update",dto);
	}
	@Override
	public int delete(BMemberDto dto) {
		return sqlSession.delete(namespace+".delete",dto);
	}

	@Override
	public BMemberDto selectOne(BMemberDto dto) {
		return sqlSession.selectOne(namespace+".selectOne",dto);
	}

	@Override
	public List<BMemberDto> selectAll() {
		return sqlSession.selectList(namespace+".selectAll");
	}
	
}
