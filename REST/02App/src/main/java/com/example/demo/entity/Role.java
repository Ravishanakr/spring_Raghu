package com.example.demo.entity;

public class Role {

	private Integer roleId;
	private String rolecode;

	public Role(Integer roleId, String rolecode) {
		super();
		this.roleId = roleId;
		this.rolecode = rolecode;
	}

	public Integer getRoleId() {
		return roleId;
	}

	public void setRoleId(Integer roleId) {
		this.roleId = roleId;
	}

	public String getRolecode() {
		return rolecode;
	}

	public void setRolecode(String rolecode) {
		this.rolecode = rolecode;
	}

}
