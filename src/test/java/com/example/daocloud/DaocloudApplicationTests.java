package com.example.daocloud;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class DaocloudApplicationTests {

	@Autowired
	MySvc mySvc;

	@Test
	public void addTest1() {
		int res = mySvc.add(772 ,  119);
		assert res == 891;
	}

	@Test
	public void addTest2() {
		int res = mySvc.add(556 ,  119);
		assert res == 675;
	}

}
