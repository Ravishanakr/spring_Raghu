package com.example.demo.service;

import java.util.List;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeNotFoundException;

public interface IEmplyeService {

	public Integer saveEmployee(Employee emp);

	void updateEmployee(Employee emp);

	void deleteEmployee(Integer id) throws EmployeNotFoundException;

	Employee getOneEmployee(Integer id);

	List<Employee> getAllEmployes();

}
