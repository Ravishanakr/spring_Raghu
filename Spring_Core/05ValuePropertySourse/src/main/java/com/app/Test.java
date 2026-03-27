package com.app;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		AnnotationConfigApplicationContext a = new AnnotationConfigApplicationContext(AppConfig.class);

		DataBase bean = a.getBean(DataBase.class);

		System.out.println(bean.getUserName());
	}

}
