package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.CategoryEntity;

public interface CategorRepo extends CrudRepository<CategoryEntity, Integer> {

}
