package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(JavaConfig.class);

		
		Object bean = c.getBean("obj");
		
		System.out.println(bean);
		
	}

}
