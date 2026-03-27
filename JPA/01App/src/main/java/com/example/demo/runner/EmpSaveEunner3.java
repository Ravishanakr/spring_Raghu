package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.data.domain.Example;
import org.springframework.stereotype.Component;

import com.example.demo.entity.EmployeR;
import com.example.demo.repo.Repooo;

@Component
@Order(15)
public class EmpSaveEunner3 implements CommandLineRunner {

	@Autowired
	public Repooo repo;

	@Override
	public void run(String... args) throws Exception {

		EmployeR e = new EmployeR();

		e.setEmpDep("Dev");

		
		System.out.println("****Employe Example Object*******");
		
		Example<EmployeR> of = Example.of(e);
		repo.findAll(of).forEach(p -> System.out.println(p));

	}

}
