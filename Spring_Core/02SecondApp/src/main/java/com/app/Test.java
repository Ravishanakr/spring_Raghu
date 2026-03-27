package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext a = new ClassPathXmlApplicationContext("config.xml");

		Service bean = (Service) a.getBean("ser");

		System.out.println(bean.getRepo());

	}

}
