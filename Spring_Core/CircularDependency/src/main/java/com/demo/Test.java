package com.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext c = new ClassPathXmlApplicationContext("config.xml");

		Employee bean = c.getBean(Employee.class);
		
		Project bean2 = c.getBean(Project.class);
		
		System.out.println(bean2.getPcode());
		System.out.println(bean2.getEob());

		

		System.out.println(bean.getName());
		System.out.println(bean.getPob());


	}
}
