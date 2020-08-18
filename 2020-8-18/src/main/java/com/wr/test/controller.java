package com.wr.test;




import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.wr.service.IdolService;
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:applicationContext.xml")
public class controller {
	@Autowired
private IdolService is;
	@Test
	public void test() {
		System.out.println("test");
		ApplicationContext ac = new ClassPathXmlApplicationContext("applicationContext.xml");
	 IdolService is= (IdolService) ac.getBean("idolServiceimpl");
		is.addIdol();
	}

}
