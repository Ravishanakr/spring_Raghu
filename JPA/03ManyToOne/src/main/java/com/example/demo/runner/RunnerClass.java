package com.example.demo.runner;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Departmentt;
import com.example.demo.entity.Employee;
import com.example.demo.repo.DeptRepo;
import com.example.demo.repo.EmpRepo;

@Component
public class RunnerClass implements CommandLineRunner {

	@Autowired
	private DeptRepo dept;

	@Autowired
	private EmpRepo emp;

	@Override
	public void run(String... args) throws Exception {

		Departmentt d = new Departmentt(101, "Dev", "Ravi");

		dept.save(d);

		//Employee e = new Employee(1023, "Deva", 10223.00d, d);
		Employee e2 = new Employee(1024, "Salar", 310123.00d, d);
		Employee e3= new Employee(1025, "Rebel", 4510123.00d, d);
		Employee e4 = new Employee(1026, "Rishi", 120123.00d, d);

		emp.save(e2);
		emp.save(e3);
		emp.save(e4);


	}

}
