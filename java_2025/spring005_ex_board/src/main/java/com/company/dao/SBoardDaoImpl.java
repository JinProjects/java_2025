package com.company.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.company.dto.SBoardDto;
public class SBoardDaoImpl implements SBoardDao {
	
	@Autowired
	SqlSession sqlSession;
	private static final String namespace = "com.company.dao.SBoardDao";
	
	@Override
	public int insert(SBoardDto dto) {
		return sqlSession.insert(namespace+".insert",dto);
	}

	@Override
	public int update(SBoardDto dto) {
		return sqlSession.update(namespace+".update", dto);
	}
	@Override
	public int updateHit(int bno) {
		return sqlSession.update(namespace+".updateHit", bno);
	}
	@Override
	public int delete(int bno) {
		return sqlSession.delete(namespace+".delete",bno);
	}

	@Override
	public SBoardDto selectOne(int bno) {
		return sqlSession.selectOne(namespace+".selectOne",bno);
	}

	@Override
	public List<SBoardDto> selectAll() {
		return sqlSession.selectList(namespace+".selectAll");
	}

}
