package com.example.demo.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Courses {

	@Id
	private Integer couseId;
	private String courseName;
	private Double courseFee;

	public Courses() {
		// TODO Auto-generated constructor stub
	}

	public Courses(Integer couseId, String courseName, Double courseFee) {

		this.couseId = couseId;
		this.courseName = courseName;
		this.courseFee = courseFee;
	}

	public Integer getCouseId() {
		return couseId;
	}

	public void setCouseId(Integer couseId) {
		this.couseId = couseId;
	}

	public String getCourseName() {
		return courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	public Double getCourseFee() {
		return courseFee;
	}

	public void setCourseFee(Double courseFee) {
		this.courseFee = courseFee;
	}

}
