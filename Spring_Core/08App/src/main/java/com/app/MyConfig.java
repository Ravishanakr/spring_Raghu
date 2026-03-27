package com.app;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;

@Configuration
@PropertySource("classpath:jdbc.properties")
public class MyConfig {

	@Autowired
	private Environment env;

	@Bean
	public DriverManager man() {

		DriverManager d = new DriverManager();
		d.setDriverClass(env.getProperty("my.driver"));
		d.setUrl(env.getProperty("my.url"));
		return d;
	}

}
