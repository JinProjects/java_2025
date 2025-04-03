package spring012_useful;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/root-context.xml")
public class Test_userDAO {
	
	@Autowired
	UserDao userDao; 
	
	@Test
	//@Ignore
	public void selectAll() {
		System.out.println(userDao.selectAll());
	}
	
}
