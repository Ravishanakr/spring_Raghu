package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class JdbcAppApplication {

	public static void main(String[] args) {
//		PasswordEncoder p=new BCryptPasswordEncoder();
//		String encode = p.encode("Ravi123");
//		System.out.println(encode);

		SpringApplication.run(JdbcAppApplication.class, args);
	}

}
