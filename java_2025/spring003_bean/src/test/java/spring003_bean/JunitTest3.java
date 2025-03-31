package spring003_bean;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.ioctest2.AnimalFarm;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:config/test3.xml")
public class JunitTest3 {
	@Autowired// 3. 생성자, 프로퍼티 있는지 테스트하고 자동연결
	ApplicationContext context; //1. bean(스프링이 관리하는 객체들)
	// 2. ApplicationContext - bean 생성부터 소멸까지 관리
	
	@Test
	public void test1() {
		AnimalFarm myFarm = context.getBean("animalFarm",AnimalFarm.class);
		assertEquals("sally>Cat-eat", myFarm.aniEat());
		//myFarm.print();
	}
	
}
