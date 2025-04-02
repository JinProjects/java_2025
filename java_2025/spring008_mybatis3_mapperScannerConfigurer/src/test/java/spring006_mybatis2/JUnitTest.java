package spring006_mybatis2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.SBoardDAO;
import com.company.dao.UserDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/root-context.xml")
public class JUnitTest {
	@Autowired
	SBoardDAO sboardDAO;
	@Autowired
	UserDao userDAO;
	@Test
	public void test() {
	//	System.out.println(sboardDAO.selectNow());
		System.out.println(userDAO.selectAll());
	}
	
}
