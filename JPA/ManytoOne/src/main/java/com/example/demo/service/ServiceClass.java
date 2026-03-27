package com.example.demo.service;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.CategoryEntity;
import com.example.demo.entity.ProductEntity;
import com.example.demo.repo.CategorRepo;
import com.example.demo.repo.ProductRepo;

@Service
public class ServiceClass {

	@Autowired
	private CategorRepo cateRepo;

	@Autowired
	private ProductRepo productRepo;

	public void save() {

		ProductEntity pe1 = new ProductEntity();
		pe1.setProductId(103);
		pe1.setProductName("Laptop");
		pe1.setWidth("120cm");

		ProductEntity pe2 = new ProductEntity();
		pe2.setProductId(104);
		pe2.setProductName("Laptop");
		pe2.setWidth("120cm");

		ProductEntity pe3 = new ProductEntity();
		pe3.setProductId(105);
		pe3.setProductName("Laptop");
		pe3.setWidth("120cm");

		CategoryEntity ce = new CategoryEntity();
		ce.setCategoryId(101);
		ce.setCategoryName("Electronics");
		List<ProductEntity> asList = Arrays.asList(pe1, pe2, pe3);

		ce.setProducts(asList);

		cateRepo.save(ce);

	}

}
