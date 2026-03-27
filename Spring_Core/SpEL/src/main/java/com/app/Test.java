package com.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) {

		ApplicationContext c = new AnnotationConfigApplicationContext(MyConfig.class);

		Demo bean = c.getBean(Demo.class);
		
		Data bean2 = c.getBean(Data.class);
		
		System.out.println(bean2.getName());
		
		System.out.println(bean.getCode());
		System.out.println(bean.getValue());
		System.out.println(bean.getOtp());



	}

}
