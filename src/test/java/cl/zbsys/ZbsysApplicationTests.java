package cl.zbsys;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = ZbsysApplication.class)
@WebAppConfiguration
public class ZbsysApplicationTests {

	@Test
	public void contextLoads() {
	}

}
