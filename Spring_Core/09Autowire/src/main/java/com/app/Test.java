package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		
		AnnotationConfigApplicationContext c=new AnnotationConfigApplicationContext(Config.class);
		
		
	      Service bean = c.getBean(Service.class);
		
		  System.out.println(bean.getRepo().getUrl());
		
	}
}
