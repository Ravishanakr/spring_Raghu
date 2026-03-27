package com.example.demo.controller;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Role;
import com.example.demo.entity.User;

@RestController
@RequestMapping("/user")
public class UserRestController {

	@GetMapping("/oneUser")
	public ResponseEntity<User> getOneUser() {

		Set<String> roles = Set.of("P1", "P2");
		Map<String, Integer> map = new HashMap<>();
		map.put("SAMSUNG", 101);
		map.put("APPLE", 102);
		map.put("XIOMI", 103);

		User user = new User(101, "Ravi Shankar", "Dev", roles, map, "12321");

		ResponseEntity<User> res = new ResponseEntity<>(user, HttpStatus.OK);
		return res;

	}

	@GetMapping("/list")
	public ResponseEntity<List<Role>> getRoles() {
		List<Role> rolesList = Arrays.asList(new Role(101, "ADMIN"), new Role(102, "QA"), new Role(103, "DEV"));
		ResponseEntity<List<Role>> responseEntitys = new ResponseEntity<>(rolesList, HttpStatus.OK);
		return responseEntitys;

	}

	@GetMapping("/map")
	public ResponseEntity<Map<String, Role>> getMappedRoles() {

		Map<String, Role> mapRoles = Map.of("R1", new Role(1101, "QA"), "R2", new Role(1102, "Dev"), "R3",
				new Role(1103, "DevOps"));

		ResponseEntity<Map<String, Role>> responseEntity = new ResponseEntity<>(mapRoles, HttpStatus.OK);
		return responseEntity;

	}

}
