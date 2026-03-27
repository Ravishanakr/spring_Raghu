package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext c = new ClassPathXmlApplicationContext("config.xml");

		Tocken bean = c.getBean(Tocken.class);

		Tocken bean1 = c.getBean(Tocken.class);

		System.out.println(bean.hashCode());
		System.out.println(bean1.hashCode());

	}

}
