package test;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringAOPTest {

	public static void main(String[] args) throws Exception{
		ClassPathXmlApplicationContext context =
			    new ClassPathXmlApplicationContext(new String[] {"testSpringConfig.xml"});
		try{
			TestBizService service = (TestBizService) context.getBean("testService");
			service.doSth(1,"test string val");
		}catch(Throwable e){
			e.printStackTrace();
		}
		//new TestAspect().log();
		
		context.close();
		System.exit(0);
	}
}