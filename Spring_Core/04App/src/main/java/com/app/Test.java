package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	
	public static void main(String[] args) {
		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(Congfig.class);

//		c.scan("com.app");
//		
//		c.refresh();
//		
		Servicee bean = c.getBean(Servicee.class);
		
		System.out.println(bean.getReslover());
		System.out.println(bean.getPathToStore());

		
		

	}

}
