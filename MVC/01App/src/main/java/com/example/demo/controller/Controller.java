package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;

@org.springframework.stereotype.Controller
public class Controller {

	@GetMapping("/hi")
	public String m1() {

		return "Home";
	}

}
