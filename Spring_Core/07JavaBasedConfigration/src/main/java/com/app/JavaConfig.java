package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	//1 method = 1 object
	
	@Bean
	public DriverManager obj() {

		DriverManager d = new DriverManager();

		d.setDriverClass("Oracle");
		d.setUrl("Oracle Url");
		return d;
	}

}
