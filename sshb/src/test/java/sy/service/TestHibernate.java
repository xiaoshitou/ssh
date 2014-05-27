package sy.service;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;

import com.yyb.manager.pageModel.Puser;
import com.yyb.manager.service.UserManagerI;


public class TestHibernate {

	@Test
	public void saveTest(){
		ApplicationContext ac = new ClassPathXmlApplicationContext(new String[]{"classpath:spring-hibernate.xml","classpath:spring.xml"});
		UserManagerI userManager =(UserManagerI) ac.getBean("userService");
		Puser user=new Puser();
		user.setName("1");
		user.setPwd("1");
		userManager.login(user);
	}
}
