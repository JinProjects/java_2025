package mytld.mycompany.myapp;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.SBoardDao;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "file:src/main/webapp/WEB-INF/spring/root-context.xml")
public class Test1_now {
	@Autowired
	ApplicationContext context;
	@Autowired
	DataSource dataSource;
	@Autowired
	SBoardDao dao;
	
	@Test
	public void test() {
		System.out.println(dao.selectAll());
	}
}
