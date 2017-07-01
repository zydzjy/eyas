package test;

import org.aspectj.lang.JoinPoint;
//import org.aspectj.lang.ProceedingJoinPoint;

public class TestAspect {
	
	public void beforeLog(JoinPoint jp){
		//Object[] args = jp.getArgs();
		System.out.println("beforeLog!!!");
	}
	
	public void afterThrowing(){
		System.out.println("afterThrowing!!!");
	}
		
	public void afterLog(){
		System.out.println("afterLog!!!");
	}
}
