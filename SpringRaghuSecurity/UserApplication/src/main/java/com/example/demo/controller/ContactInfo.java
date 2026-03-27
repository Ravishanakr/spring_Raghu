package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ContactInfo {

	@GetMapping("/private/info")
	public String getContactInfo() {
		return "Name:Salaar Place:Khansar Mobile:12347890";
	}

}
