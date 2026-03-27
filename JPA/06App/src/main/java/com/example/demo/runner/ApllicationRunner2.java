package com.example.demo.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Book;
import com.example.demo.repo.Bookk;

@Component
@Order(5)
public class ApllicationRunner2 implements CommandLineRunner {

	@Autowired
	private Bookk repo;

	@Override
	public void run(String... args) throws Exception {

		System.out.println("*********Application runner 2*********");

		Optional<Book> fetchBookById = repo.fetchBookById(101);

		if (fetchBookById.isPresent()) {

			Book book = fetchBookById.get();
			System.out.println(book);
		}

		List<Integer> asList = Arrays.asList(101, 102);
		List<Book> fetchBookbyId2 = repo.fetchBookbyIdd(asList);

		System.out.println(fetchBookbyId2);
		
		
		
		
		
		List<Book> fetchBookByIds = repo.fetchBookByIds(101,102);
		System.out.println(fetchBookByIds);
	}

}
