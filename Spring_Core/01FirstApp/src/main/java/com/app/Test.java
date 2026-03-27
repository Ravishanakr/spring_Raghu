package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext a = new ClassPathXmlApplicationContext("config.xml");

		OracleApp bean = (OracleApp) a.getBean("demo1");

		System.out.println(bean.hashCode());

		
		OracleApp bean2 = (OracleApp) a.getBean("demo1");
		
		System.out.println(bean2.hashCode());


	}

}
