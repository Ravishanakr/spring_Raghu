package com.example.demo.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeNotFoundException;
import com.example.demo.repo.EmployeRepo;
import com.example.demo.utils.EmployeUtils;

@Service
public class EmployeServiceImpl implements IEmplyeService {

	@Autowired
	private EmployeRepo repo;

//	@Autowired
//	private EmployeUtils utils;

	@Override
	public Integer saveEmployee(Employee emp) {
		System.out.println(emp.getEmpGender());

		EmployeUtils.commCalculation(emp);
		Employee employe = repo.save(emp);
		return employe.getEmpId();
	}

	@Override
	public void updateEmployee(Employee emp) {
		EmployeUtils.commCalculation(emp);
		repo.save(emp);
	}

	@Override
	public void deleteEmployee(Integer id) throws EmployeNotFoundException {
		Optional<Employee> byId = repo.findById(id);

		if (byId.isPresent()) {
			repo.deleteById(id);
		} else {

			throw new EmployeNotFoundException("Employe Not Found with id " + id);

		}

	}

	@Override
	public Employee getOneEmployee(Integer id) {

		Optional<Employee> emp = repo.findById(id);
		return emp.get();
	}

	@Override
	public List<Employee> getAllEmployes() {
		Iterable<Employee> all = repo.findAll();
		return (List<Employee>) all;
	}

}
