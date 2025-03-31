package spring001_di;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertSame;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.ioctest.Calc;
import com.company.ioctest.MyArea;

//1. String ioc 컨테이너생성
//2. 경로

@RunWith(SpringJUnit4ClassRunner.class)//1. String ioc 컨테이너생성 
@ContextConfiguration(locations="classpath:com/company/config/beans002.xml") //설정파일 경로
public class JunitTest002 {
	@Autowired 
	ApplicationContext context; // 3. Bean (spring 관리하는 객체)
	// ApplicationContext - Bean 등록, 생성, 조회, 반환관리
	// @Autowired - 객체가 있는지 검사하고 있다면 자동연결
	
	@Test 
	//@Ignore
	public void test1() {
		//context.getBean() << 클래스를 가져옴
		Calc calc = context.getBean("rect", Calc.class);
		Calc tri = (Calc)context.getBean("tri");
		MyArea myArea = context.getBean("myArea",MyArea.class);
		//assertEquals("예상값", "처리할값");
		assertEquals("alpha>100.0", myArea.mycalc(10, 10));
	} //ctrl + f11
	
	//@Test
	@Ignore
	public void test2() {
		MyArea myArea1 = context.getBean("myArea",MyArea.class);
		MyArea myArea2 = context.getBean("myArea",MyArea.class);
		
		//사용방법2 : assertSame(area1, area2);
		//
		assertSame(myArea1, myArea2);
		

	}
} 
