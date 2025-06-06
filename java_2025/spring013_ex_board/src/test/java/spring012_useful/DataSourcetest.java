package spring012_useful;

import java.sql.Connection;

import javax.sql.DataSource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration("classpath:config/root-context.xml")
public class DataSourcetest {

	@Autowired
	private DataSource dataSource;
	
	@Test
	public void testConnection() {
		try(
			Connection con = dataSource.getConnection();	
		){
			
		System.out.println("con="+con);
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		
	}	
	
}