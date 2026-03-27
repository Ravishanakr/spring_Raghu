package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.entity.Employee;

@Controller
public class EmpController {

	@GetMapping("/show")
	public String showForm() {

		return "EmpRegister";

	}

	@PostMapping("/register")
	public String readData(@ModelAttribute Employee employe, Model m) {
		m.addAttribute("Employe", employe);
		return "EmpData";

	}

}
