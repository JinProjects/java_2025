package spring004_jdbc;

import javax.sql.DataSource;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.TestDao;

@RunWith(SpringJUnit4ClassRunner.class) //1.spring 구동
@ContextConfiguration(locations = "classpath:config/root-context.xml") // 2.경로
public class test1_dao {
	@Autowired
	ApplicationContext context; // 3. spring bean 생성~소멸 관리
	
	@Autowired
	DataSource datasource;
	
	@Autowired 
	TestDao dao;
	
	//@Test
	@Ignore
	public void test1() {
		System.out.println(context);
	}
	//@Test
	@Ignore
	public void test2() {
		System.out.println(datasource);
	}
	
	@Test
	public void test3() {
		System.out.println(dao.readTime());
	}
}
