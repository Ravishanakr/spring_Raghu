package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext(MyAppConfig.class);

		Service bean = c.getBean(Service.class);
		Tocken tocken = bean.getTocken();

		System.out.println(bean.hashCode() + " " + tocken.hashCode());

		System.out.println("");
		Service bean1 = c.getBean(Service.class);
		Tocken tocken1 = bean.getTocken();
		
		System.out.println(bean1.hashCode() + " " + tocken1.hashCode());

		
		
	}
}
