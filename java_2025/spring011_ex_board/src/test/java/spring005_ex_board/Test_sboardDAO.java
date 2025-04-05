package spring005_ex_board;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.company.dao.SBoardDao;
import com.company.dto.SBoardDto;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath:config/root-context.xml")
public class Test_sboardDAO {
	
	@Autowired
	SBoardDao sboard; 
	
	SBoardDto dto = new SBoardDto("홍길동", "1234", "제목5", "내용5", "127.0.0.1");
	
	//@Test
	@Ignore
	public void insert() {
		System.out.println(sboard.insert(dto));
	}
	
	//@Test
	@Ignore
	public void update() {
		dto.setBno(2);
		dto.setBtitle("제목수정1");
		dto.setBcontent("내용수정1");
		System.out.println(sboard.update(dto));
		System.out.println(sboard.selectAll());
	}
	//@Test
	@Ignore
	public void updateHit() {
		System.out.println(sboard.updateHit(1));
		System.out.println(sboard.selectOne(1));
	}
	//@Test
	@Ignore
	public void delete() {
		System.out.println(sboard.delete(1));
	}
	//@Test
	@Ignore
	public void selectOne() {
		System.out.println(sboard.selectOne(1));
	}
	@Test
	//@Ignore
	public void selectAll() {
		System.out.println(sboard.selectAll());
	}
}
