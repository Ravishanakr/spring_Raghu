package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Product;
import com.example.demo.exception.ProductNotFoundException;
import com.example.demo.service.ProductService;

@RestController
public class ProductRestController {

	@Autowired
	private ProductService service;

	/*
	 * @GetMapping("/one/{id}") public ResponseEntity<String> getProductById(
	 * 
	 * @PathVariable("id") Integer id ) { if(id==150) { return new
	 * ResponseEntity<>("Product Exist", HttpStatus.OK); } else throw new
	 * ProductNotFoundException("Product Not Found " + id); }
	 */

	@GetMapping("/one/{id}")
	public ResponseEntity<Product> getProductById(@PathVariable Integer id) {
		ResponseEntity<Product> response = null;
		try {
			 Product oneProductById = service.getOneProductById(id);
			response = new ResponseEntity<Product>(oneProductById, HttpStatus.OK);
		} catch (ProductNotFoundException pnfe) {
			pnfe.printStackTrace();
			throw pnfe;// call handler
		}
		return response;
	}
}
