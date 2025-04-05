package com.company.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("sboardDAO")
public class SBoardDAOImpl implements SBoardDAO {
	@Autowired
	SqlSession sqlSession;
	
	private static final String namespace = "com.company.dao.SBoardDAO";
	
	@Override
	public String selectNow() {
		return sqlSession.selectOne(namespace+".selectNow");
	}

}
