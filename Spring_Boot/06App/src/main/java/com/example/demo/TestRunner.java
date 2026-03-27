package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestRunner implements CommandLineRunner {

	@Autowired
	private MyDataBase db;

	@Override
	public void run(String... args) throws Exception {

		System.out.println(db);

	}

}
