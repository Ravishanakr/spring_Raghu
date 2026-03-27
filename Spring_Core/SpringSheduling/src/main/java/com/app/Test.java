package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext c = new AnnotationConfigApplicationContext(Demo1.class);

		//ReportService bean = c.getBean(ReportService.class);

	}

}
