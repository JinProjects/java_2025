package spring005_ex_board;

import java.net.InetAddress;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.BMemberDaoImpl;
import com.company.dto.BMemberDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/root-context.xml")
public class Test_bmemberDAO {
	@Autowired
	BMemberDaoImpl bmemberDAO;
	
	BMemberDto dto = 
			new BMemberDto("test1", "1234", "홍길동", "test@test.com", "인천광역시", "서구", "가정로", "127.0.0.1"); 
	@Test
	//@Ignore
	public void insert() {
		System.out.println(bmemberDAO.insert(dto));
	}
	
	//@Test
	@Ignore
	public void update() {
		//dto.setBno(2);
	//	dto.setBtitle("제목수정1");
	//	dto.setBcontent("내용수정1");
		System.out.println(bmemberDAO.update(dto));
		System.out.println(bmemberDAO.selectAll());
	}
	
	//@Test
	@Ignore
	public void delete() {
		System.out.println(bmemberDAO.delete(dto));
	}
	//@Test
	@Ignore
	public void selectOne() {
		System.out.println(bmemberDAO.selectOne(dto));
	}
	//@Test
	@Ignore
	public void selectAll() {
		System.out.println(bmemberDAO.selectAll());
	}
}
