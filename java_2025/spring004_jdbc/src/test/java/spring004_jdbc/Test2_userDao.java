package spring004_jdbc;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.UserDao;
import com.company.dto.UserDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/root-context.xml")
public class Test2_userDao {
	@Autowired
	ApplicationContext context;
	@Autowired
	UserDao dao;
	UserDto dto = new UserDto("sixth",66);
	UserDto dto2 = new UserDto(5,"sixth",77);
	//@Test
	@Ignore
	public void selectAll() {
		System.out.println(dao.selectAll());
	};
	//@Test
	@Ignore
	public void insert() {
		//dto.setName("sixth");
		//dto.setAge(55);
		System.out.println(dao.insert(dto));
	}
	//@Test
	@Ignore
	public void selectOne() {
		System.out.println(dao.selectOne(1));
	}
	@Test
	public void update() {
		System.out.println(dao.update(dto2));
	}
	//@Test
	@Ignore
	public void delete() {
		System.out.println(dao.delete(5));
	}
}
