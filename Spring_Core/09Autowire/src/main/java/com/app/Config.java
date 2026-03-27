package com.app;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.app")
public class Config {

	@Bean
	public MyRepo repoo() {
		MyRepo r = new MyRepo();
		r.setUrl("Oracle");
		return r;
	}
	@Bean
	public MyRepo repo2() {
		MyRepo r2 = new MyRepo();
		r2.setUrl("MySql");
		return r2;
	}

}
