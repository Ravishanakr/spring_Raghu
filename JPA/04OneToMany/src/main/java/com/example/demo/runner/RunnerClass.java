package com.example.demo.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Model;
import com.example.demo.entity.Product;
import com.example.demo.repo.ModelRepo;
import com.example.demo.repo.ProductRepo;

@Component
public class RunnerClass implements CommandLineRunner {

	@Autowired
	private ProductRepo pRepo;

	@Autowired
	private ModelRepo mRepo;

	@Override
	public void run(String... args) throws Exception {

		Model m1 = new Model(101, "F15", "4-GB Ram Blue");
		Model m2 = new Model(102, "F15", "8-GB Ram Pink");
		Model m3 = new Model(103, "F15", "16-GB Ram Grey");

		mRepo.save(m1);
		mRepo.save(m2);
		mRepo.save(m3);

		Product p = new Product(1011, "Samsung", Arrays.asList(m1, m2, m3));
		pRepo.save(p);

	}

}
