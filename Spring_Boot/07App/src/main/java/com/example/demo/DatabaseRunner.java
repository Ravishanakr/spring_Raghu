package com.example.demo;

import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;


@Profile({"prod","dev","qa"})
@Component
public class DatabaseRunner implements CommandLineRunner {

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Prod dev uat");
	}

}
