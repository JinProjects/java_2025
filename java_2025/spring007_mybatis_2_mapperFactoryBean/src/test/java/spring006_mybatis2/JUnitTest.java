package spring006_mybatis2;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.SBoardDAO;

@RunWith(SpringJUnit4ClassRunner.class)//1. spring구동 테스트
@ContextConfiguration(locations = "classpath:config/root-context.xml")//2.설정
public class JUnitTest {
	@Autowired
	ApplicationContext context; //3. Bean(스프링이 관리하는객체) 생성~소멸까지 관리
	@Autowired
	SBoardDAO sboardDAO;
	@Test
	public void test() {
		System.out.println(sboardDAO.selectNow());
	}
	
}
