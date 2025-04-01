package com.company.dao;

import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository("testDao") // 1. 스프링이 관리하는 부품객체 - dao
public class TestDaoImpl implements TestDao {
	@Autowired
	private SqlSession sqlSession; // 2. crud ( insert, update, delete, select )
	private static final String namespace = "com.company.dao.TestDao";
	
	@Override
	public String readTime() {
		return sqlSession.selectOne(namespace+".readTime");
	}
	// sqlSsession.insert(경로의 메서드명, dto)
	// sqlSsession.update(경로의 메서드명, dto)
	// sqlSsession.delete(경로의 메서드명, no)
	// sqlSsession.selectOne(경로의 메서드명, no)
	// sqlSsession.selectList(경로의 메서드명, no)
}
