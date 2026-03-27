package com.example.demo.runner;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Component;

import com.example.demo.entity.EmployeR;
import com.example.demo.repo.Repooo;

@Component
@Order(10)
public class EmpSaveEunner2 implements CommandLineRunner {

	@Autowired
	public Repooo repo;

	@Override
	public void run(String... args) throws Exception {

		List<EmployeR> all = repo.findAll(Sort.by(Direction.DESC, "empSal"));

		all.forEach(a -> System.out.println(a));

		System.out.println("**************");

		PageRequest of = PageRequest.of(2, 3);

		Page<EmployeR> all2 = repo.findAll(of);

		all2.get().forEach(p -> System.out.println(p));

	}

}
