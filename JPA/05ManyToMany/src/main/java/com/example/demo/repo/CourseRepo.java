package com.example.demo.repo;

import org.springframework.data.repository.CrudRepository;

import com.example.demo.entity.Courses;

public interface CourseRepo extends CrudRepository<Courses, Integer> {

}
