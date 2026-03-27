package com.example.demo.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Book;
import com.example.demo.repo.Bookk;

@Component
@Order(1)
public class ApllicationRunner implements CommandLineRunner {

	@Autowired
	private Bookk repo;

	@Override
	public void run(String... args) throws Exception {

		List<Book> byBookAuthor = repo.findByBookAuthor("ravi");

		byBookAuthor.forEach(p -> System.out.println(p));

	}

}
