package com.example.demo.service;

import java.util.Optional;

import com.example.demo.entity.User;

public interface IService {

	public Integer saveuser(User user);

	public Optional<User> getOneUser(Integer id);

}
