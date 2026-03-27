package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_department")
public class Departmentt {

	// one Department having Multiple Departments

	@Id
	private Integer deptId;
	private String deptName;
	private String deptAdmin;

	public Departmentt() {
		// TODO Auto-generated constructor stub
	}

	public Departmentt(Integer deptId, String deptName, String deptAdmin) {

		this.deptId = deptId;
		this.deptName = deptName;
		this.deptAdmin = deptAdmin;
	}

	public Integer getDeptId() {
		return deptId;
	}

	public void setDeptId(Integer deptId) {
		this.deptId = deptId;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getDeptAdmin() {
		return deptAdmin;
	}

	public void setDeptAdmin(String deptAdmin) {
		this.deptAdmin = deptAdmin;
	}

}
