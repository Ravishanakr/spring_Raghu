package com.example.demo.runner;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.example.demo.entity.Courses;
import com.example.demo.entity.Studentt;
import com.example.demo.repo.CourseRepo;
import com.example.demo.repo.StudentRepo;

@Component
public class Runners implements CommandLineRunner {

	@Autowired
	public CourseRepo repo;

	@Autowired
	public StudentRepo repo2;

	@Override
	public void run(String... args) throws Exception {

		Courses c1 = new Courses(105, "Java", 89099.00);
		Courses c2 = new Courses(106, "Angular", 89099.00);

		repo.save(c1);
		repo.save(c2);

		Studentt s = new Studentt(101, "Ravi", "ravi@gmail.com", Arrays.asList(c1, c2));

		repo2.save(s);

	}

}
