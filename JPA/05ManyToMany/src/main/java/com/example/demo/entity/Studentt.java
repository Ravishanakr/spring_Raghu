package com.example.demo.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;

@Entity
public class Studentt {

	@Id
	private Integer studentId;
	private String studentName;
	private String studentEmail;

	public Studentt() {
		// TODO Auto-generated constructor stub
	}

	public Studentt(Integer studentId, String studentName, String studentEmail, List<Courses> courses) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentEmail = studentEmail;
		this.courses = courses;
	}

	@ManyToMany
	@JoinTable(name = "stdtcouestable", 
	joinColumns = @JoinColumn(name = "sidfk"), 
	inverseJoinColumns = @JoinColumn(name = "cidfk"))
	private List<Courses> courses;

	public Integer getStudentId() {
		return studentId;
	}

	public void setStudentId(Integer studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentEmail() {
		return studentEmail;
	}

	public void setStudentEmail(String studentEmail) {
		this.studentEmail = studentEmail;
	}

	public List<Courses> getCourses() {
		return courses;
	}

	public void setCourses(List<Courses> courses) {
		this.courses = courses;
	}

}
