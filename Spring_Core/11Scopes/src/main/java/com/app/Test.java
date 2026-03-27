package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext c = new AnnotationConfigApplicationContext(Config.class);
		
		
		Tocken bean = c.getBean(Tocken.class);
		Tocken bean2 = c.getBean(Tocken.class);

		
		System.out.println(bean.getTocken());
		System.out.println(bean2.getTocken());


	}

}
