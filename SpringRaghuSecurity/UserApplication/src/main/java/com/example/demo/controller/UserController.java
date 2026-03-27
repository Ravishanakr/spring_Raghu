package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ChangePasswordDto;
import com.example.demo.dto.UserSignIn;
import com.example.demo.entity.UserDetails;
import com.example.demo.service.UserSevice;

@RestController
public class UserController {

	@Autowired
	public UserSevice userService;

	@PostMapping("/public/signup")
	public String signUp(@RequestBody UserDetails userdetails) {
		return userService.signUpUser(userdetails);

	}

	@PostMapping("/public/signin")
	public String signUp(@RequestBody UserSignIn signIn) {
		return userService.signInUser(signIn);

	}

	@PostMapping("/private/changepassword/{maildId}")
	public String changePassword(@RequestBody ChangePasswordDto passwordDto, @PathVariable String maildId) {
		
		System.out.println(maildId);
		System.out.println(passwordDto.getNewPassword());
		System.out.println(passwordDto.getOldPassword());

		return userService.changePassword(passwordDto, maildId);
	}

	@DeleteMapping("/private/delete/{maildId}")
	public String deleteProfile(@PathVariable String maildId) {
		
		System.out.println(maildId);
		return userService.deleteUser(maildId);
	}

}
