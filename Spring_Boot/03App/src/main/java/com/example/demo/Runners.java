package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class Runners implements CommandLineRunner {

	@Autowired
	private ConfigProperties file;
	
	@Override
	public void run(String... args) throws Exception {
		
		System.out.println(file);
	}
   
}
