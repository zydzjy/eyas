package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import eyas.base.bean.UserBean;
//import eyas.base.service.UserService;

public class SpringTxTest {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"applicationContext.xml"});
		try{
			//UserService userService = (UserService)context.getBean("userServiceImpl");
			UserBean newUser = new UserBean();
			newUser.setUserId(11L);
			newUser.setUserName("ÕÅÈý");
			newUser.setUserPwd("123");
			//userService.addUser(newUser);
		}catch(Throwable e){
			e.printStackTrace();
		}
		//new TestAspect().log();
		
		context.close();
		System.exit(0);
	}

}
