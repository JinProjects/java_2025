package spring012_useful;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.BMemberDao;
import com.company.dto.BMemberDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/root-context.xml")
public class BMemeberTest {
	@Autowired
	BMemberDao dao;
	@Autowired
	BMemberDto dto;
	//@Test
	@Ignore
	public void selectAll() {
		System.out.println(dao.selectAll());
	}
	//@Test
	@Ignore
	public void selectOne() {
		System.out.println(dao.selectOne(dto));
	}
	//@Test
	@Ignore
	public void insert() {
		System.out.println(dao.insert(dto));
	}
	@Test
	//@Ignore
	public void update() {
		System.out.println(dao.update(dto));
	}
	//@Test
	@Ignore
	public void delete() {
		System.out.println(dao.delete(dto));
	}
	
}
