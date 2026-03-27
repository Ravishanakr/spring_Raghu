package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_employee")
public class Employee {
	// one Department having Multiple Departments

	@Id
	private Integer empId;
	private String empName;
	private Double empSal;

	@ManyToOne
	@JoinColumn(name = "difk")
	private Departmentt deptId;

	public Employee() {
		// TODO Auto-generated constructor stub
	}

	public Employee(Integer empId, String empName, Double empSal, Departmentt deptId) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.deptId = deptId;
	}

	public Departmentt getDeptId() {
		return deptId;
	}

	public void setDeptId(Departmentt deptId) {
		this.deptId = deptId;
	}

	public Integer getEmpId() {
		return empId;
	}

	public void setEmpId(Integer empId) {
		this.empId = empId;
	}

	public String getEmpName() {
		return empName;
	}

	public void setEmpName(String empName) {
		this.empName = empName;
	}

	public Double getEmpSal() {
		return empSal;
	}

	public void setEmpSal(Double empSal) {
		this.empSal = empSal;
	}

}
