package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.demo.enity.Book;

@Controller
@RequestMapping("book")
public class BookController {

	@GetMapping("/show")
	public String showBook(Model model) {

		Book book = new Book(101, "Java", 5433.00d);

		model.addAttribute("book", book);

		return "Book";
	}

	@GetMapping("/list")
	public String showBooks(Model model) {

		List<Book> asList = Arrays.asList(new Book(101, "Java", 5434.00d), new Book(102, "SpringBoot", 1999.00d),
				new Book(103, "AWS", 4999.00d) {
				});

		model.addAttribute("booklist", asList);

		return "ShowBooks";
	}

}
