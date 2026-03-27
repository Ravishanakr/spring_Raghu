package com.example.demo.runner;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import com.example.demo.entity.EmployeR;
import com.example.demo.repo.Repooo;

@Component
@Order(5)
public class EmpSaveEunner implements CommandLineRunner {

	@Autowired
	public Repooo repo;

	@Override
	public void run(String... args) throws Exception {

		List<EmployeR> asList = Arrays.asList(new EmployeR(101, "Ravi", 120000.00d, "Dev"),
				new EmployeR(102, "shankar", 430000.00d, "Test"), new EmployeR(103, "deva", 610000.00d, "HR"),
				new EmployeR(104, "salaar", 290000.00d, "IT")

		);

		repo.saveAll(asList);

		List<String> allEmps = repo.getAllEmps();
		System.out.println(allEmps);

		List<EmployeR> allEmployes = repo.getAllEmployes();

		System.out.println(allEmployes);

		List<Object[]> multipleColumns = repo.getMultipleColumns();

		multipleColumns.stream().map(obj -> obj[0] + " " + obj[1]).forEach(number -> System.out.println(number));

		Optional<EmployeR> oneRow = repo.getOneRow(101);

		if (oneRow.isPresent()) {
			System.out.println(oneRow.get());
		}

	}

}
