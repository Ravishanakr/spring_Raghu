package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
public class MailServiceRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {

		
		System.out.println("No profile Annotations");
	}

}