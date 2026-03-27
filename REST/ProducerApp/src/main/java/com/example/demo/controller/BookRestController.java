package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entiy.Book;

@RestController
@RequestMapping("/v1/api/book")
public class BookRestController {

	@GetMapping("/showA")
	public ResponseEntity<String> showMsg1() {
		// return new ResponseEntity<String>("WELCOME",HttpStatus.OK);
		return ResponseEntity.ok("WELCOME TO FIRST CALL TYPE - GET");
	}

	@GetMapping("/showB/{id}/{name}")
	public ResponseEntity<String> showMsg2(@PathVariable Integer id, @PathVariable String name) {
		return ResponseEntity.ok("WELCOME TO FIRST CALL TYPE - GET ==> " + id + "-" + name);
	}

	@GetMapping("/showC")
	public ResponseEntity<Book> showMsg3() {
		return ResponseEntity.ok(new Book(101, "ABC", "RAJ", 500.0));
	}

	// try return type List<Book>
	@GetMapping("/showD")
	public ResponseEntity<List<Book>> showMsg4() {
		List<Book> asList = Arrays.asList(new Book(101, "ABC", "RAJ", 500.0), new Book(102, "PQR", "RAM", 900.0));
		return ResponseEntity.ok(asList);
	}

	@PostMapping("/showD")
	public ResponseEntity<String> showMgs4(@RequestBody Book book) {
		return ResponseEntity.ok("Data given is " + book);
	}

}