package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.example.demo.service.ServiceClass;

@SpringBootApplication
public class ManytoOneApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext run = SpringApplication.run(ManytoOneApplication.class, args);

		ServiceClass bean = run.getBean(ServiceClass.class);

		bean.save();

	}

}
