package com.demo;

public class Employee {

	private String name;

	private Project pob;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Project getPob() {
		return pob;
	}

	public void setPob(Project pob) {
		this.pob = pob;
	}

	@Override
	public String toString() {
		return "Employee [name=" + name + ", pob=" + pob + "]";
	}

}
