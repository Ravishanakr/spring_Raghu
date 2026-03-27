package com.example.demo.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.EmployeR;

@Repository
public interface Repooo extends JpaRepository<EmployeR, Integer> {

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	// fetch one column data
	@Query("SELECT E.empName FROM EmployeR E ")
	List<String> getAllEmps();

	// select all columns data
	@Query("SELECT E FROM EmployeR E ")
	List<EmployeR> getAllEmployes();

	// select multiple columns names
	@Query("select E.empName, E.empSal FROM EmployeR E")
	List<Object[]> getMultipleColumns();

	// fetch one row from db
	@Query("select e from EmployeR e where e.empId=:id")
	Optional<EmployeR> getOneRow(Integer id);

}
