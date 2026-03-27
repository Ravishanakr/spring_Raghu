package com.example.demo.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.ChangePasswordDto;
import com.example.demo.dto.UserSignIn;
import com.example.demo.entity.UserDetails;
import com.example.demo.repo.UserReposotory;

@Service
public class UserSevice {

	@Autowired
	public UserReposotory userRepo;

	public String signUpUser(UserDetails userInformation) {

		if (userRepo.findById(userInformation.getEmailId()).isPresent()) {
			return "User Already Existed";
		}

		else {
			userRepo.save(userInformation);
			return "User Created SucsessFully";

		}

	}

	public String signInUser(UserSignIn userSignIn) {
		UserDetails byEmailIdAndPassword = userRepo.findByEmailIdAndPassword(userSignIn.getUseremail(),
				userSignIn.getUserPassword());

		if (byEmailIdAndPassword != null)
			return "User Login Succesfully";
		else
			return "No User Exists";

	}

	public String changePassword(ChangePasswordDto passwordDto, String maildId) {

		UserDetails userDetails = userRepo.findByEmailIdAndPassword(maildId, passwordDto.getOldPassword());

		if (userDetails != null) {

			userDetails.setPassword(passwordDto.getNewPassword());
			userRepo.save(userDetails);
			return "Password Updated Successfully";

		} else
			return "No User Found";

	}

	public String deleteUser(String userId) {
		Optional<UserDetails> byId = userRepo.findById(userId);

		System.out.println(byId.get().getEmailId());
		if (byId.isPresent()) {
			userRepo.deleteById(userId);
			return "Record deleted sucsessfully";
		} else {
			return "No Record Found to delete";

		}
	}

}
