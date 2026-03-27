package com.example.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.UserDetails;

public interface UserReposotory extends JpaRepository<UserDetails, String> {

	UserDetails findByEmailIdAndPassword(String emaildid,String password);

}
