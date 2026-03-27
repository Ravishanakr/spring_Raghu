package com.example.demo.entity;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "t_employe")
public class Employee {

	@Id
	@GeneratedValue(strategy = GenerationType.SEQUENCE)
	private Integer empId;
	private String empName;
	private Double empSal;
	private Double empHra;
	private Double empTa;
	private String empDept;
	private String empAddress;
	private LocalDate empDob;
	private String empGender;

	public String getEmpAddress() {
		return empAddress;
	}

	public void setEmpAddress(String empAddress) {
		this.empAddress = empAddress;
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

	public Double getEmpHra() {
		return empHra;
	}

	public void setEmpHra(Double empHra) {
		this.empHra = empHra;
	}

	public Double getEmpTa() {
		return empTa;
	}

	public void setEmpTa(Double empTa) {
		this.empTa = empTa;
	}

	public String getEmpDept() {
		return empDept;
	}

	public void setEmpDept(String empDept) {
		this.empDept = empDept;
	}

	public LocalDate getEmpDob() {
		return empDob;
	}

	public void setEmpDob(LocalDate empDob) {
		this.empDob = empDob;
	}

	public String getEmpGender() {
		return empGender;
	}

	public void setEmpGender(String empGender) {
		this.empGender = empGender;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", empName=" + empName + ", empSal=" + empSal + ", empHra=" + empHra
				+ ", empTa=" + empTa + ", empDept=" + empDept + ", empAddress=" + empAddress + ", empDob=" + empDob
				+ ", empGender=" + empGender + "]";
	}

}
