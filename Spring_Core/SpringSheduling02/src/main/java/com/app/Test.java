package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext c = new AnnotationConfigApplicationContext(ConfigClass.class);

		Demo1 bean = c.getBean(Demo1.class);
		bean.reportService();

	}

}
