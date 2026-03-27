package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Departmentt;
import com.example.demo.entity.Employee;

public interface DeptRepo extends CrudRepository<Departmentt, Integer> {

}
