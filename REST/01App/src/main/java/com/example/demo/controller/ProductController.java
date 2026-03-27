package com.example.demo.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class ProductController {

	@GetMapping("/fetch")
	public ResponseEntity<String> getProduct() {

		ResponseEntity<String> response = new ResponseEntity<String>("FROM GET OPERATION", HttpStatus.OK);
		return response;
	}

	@PostMapping("/save")
	public ResponseEntity<String> createProduct() {

		ResponseEntity<String> response = new ResponseEntity<String>("FROM POST OPERATION", HttpStatus.CREATED);
		return response;
	}

	@PutMapping("/update")
	public ResponseEntity<String> updateProduct() {

		ResponseEntity<String> response = new ResponseEntity<String>("FROM PUT OPERATION", HttpStatus.CREATED);
		return response;
	}

	@DeleteMapping("/remove")
	public ResponseEntity<String> deleteProduct() {

		ResponseEntity<String> response = new ResponseEntity<String>("FROM DELETE OPERATION", HttpStatus.CREATED);
		return response;
	}

	@PatchMapping("/modifyCost")
	public ResponseEntity<String> updateProductCost() {
		ResponseEntity<String> response = new ResponseEntity<String>("FROM PATCH OPERATION", HttpStatus.CREATED);
		return response;

	}

}
