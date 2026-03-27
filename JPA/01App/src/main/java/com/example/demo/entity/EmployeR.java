package com.example.demo.entity;

import jakarta.persistence.Entity; // or javax.persistence.Entity
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class EmployeR {

	@Id
	private Integer empId;
	private String empName;
	private Double empSal;
	private String empDep;

	public EmployeR() {
		// TODO Auto-generated constructor stub
	}

	public EmployeR(Integer empId, String empName, Double empSal, String empDep) {
		super();
		this.empId = empId;
		this.empName = empName;
		this.empSal = empSal;
		this.empDep = empDep;
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

	public String getEmpDep() {
		return empDep;
	}

	public void setEmpDep(String empDep) {
		this.empDep = empDep;
	}

	@Override
	public String toString() {
		return "EmployeR [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empDep=" + empDep + "]";
	}

}
