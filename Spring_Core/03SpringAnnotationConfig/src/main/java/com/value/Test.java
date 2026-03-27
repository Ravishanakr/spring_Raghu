package com.value;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.service.HandlerInfo;

public class Test {

	public static void main(String[] args) {

		// creating container
		AnnotationConfigApplicationContext c = new AnnotationConfigApplicationContext();

		// find all classes from given packages
		c.scan("com.service");

		// refresh container
		c.refresh();

		// reading object
		HandlerInfo bean = c.getBean(HandlerInfo.class);

		System.out.println(bean.getReslover());
		System.out.println(bean.getPathToStore());

	}

}
