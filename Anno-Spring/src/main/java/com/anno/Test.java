package com.anno;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	public static void main(String[] args) {
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring-ano.xml");
		
		Vehicle obj=(Vehicle)context.getBean("car");
		obj.garage();
	}

}
