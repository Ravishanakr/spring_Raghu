package com.example.demo.controller;

import java.util.Arrays;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import com.example.demo.entity.User;

@Controller
public class UserController {

	@GetMapping("/info")
	public String showUserPage(Map<String, Object> model) {
		System.out.println(model.getClass().getName());

		model.put("uname", "Ravi");
		model.put("cname", "Spring Boot Microservices");
		return "UserHome";
	}

	// Sending one User Object
	@GetMapping("/obj")
	public String showUserOb(Model model) {
		User user = new User(10, "AJAY RAJ!", "TAG-SY");
		model.addAttribute("obj", user);

		List<User> list = Arrays.asList(new User(101, "Ravi", "React"), new User(102, "Ravi Shankar", "SptingBoot"), new User(103, "Sudha", "CIGS"),
				new User(105, "Bhargavi", "Devops"));
		model.addAttribute("listObj", list);

		return "UserData";
	}

}
