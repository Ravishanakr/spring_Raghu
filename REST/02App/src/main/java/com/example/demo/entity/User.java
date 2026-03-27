package com.example.demo.entity;

import java.util.Map;
import java.util.Set;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonProperty;

public class User {

	@JsonProperty("user-unq-id")
	private Integer userId;

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	private String userName;
	private String userRole;
	private Set<String> permissions;
	private Map<String, Integer> models;

	@JsonIgnore
	private String password;
	// private List<String> permissions;
	// private String[] permissions2;

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserRole() {
		return userRole;
	}

	public void setUserRole(String userRole) {
		this.userRole = userRole;
	}

	public Set<String> getPermissions() {
		return permissions;
	}

	public void setPermissions(Set<String> permissions) {
		this.permissions = permissions;
	}

	public Map<String, Integer> getModels() {
		return models;
	}

	public void setModels(Map<String, Integer> models) {
		this.models = models;
	}

	public User(Integer userId, String userName, String userRole, Set<String> permissions, Map<String, Integer> models,
			String password) {
		super();
		this.userId = userId;
		this.userName = userName;
		this.userRole = userRole;
		this.permissions = permissions;
		this.models = models;
		this.password = password;
	}

}
