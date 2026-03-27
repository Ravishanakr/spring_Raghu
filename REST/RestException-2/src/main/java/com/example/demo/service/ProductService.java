package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.entity.Product;
import com.example.demo.exception.ProductNotFoundException;

@Service
public class ProductService {

	public Product getOneProductById(Integer id) {
		if (id == 150)
			return new Product(id, "DUMMY");
		else
			throw new ProductNotFoundException("PRODUCT '" + id + "' NOT EXIST");
	}

}
