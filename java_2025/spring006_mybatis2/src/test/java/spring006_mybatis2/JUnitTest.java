package spring006_mybatis2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.SBoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/root-context.xml")
public class JUnitTest {
	@Autowired
	SBoardDAO sboardDAO;
	@Test
	public void test() {
		System.out.println(sboardDAO.selectNow());
	}
	
}
