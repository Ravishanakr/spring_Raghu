package com.example.demo.exception;

public class EmployeNotFoundException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public EmployeNotFoundException() {
		// TODO Auto-generated constructor stub
	}

	public EmployeNotFoundException(String name) {
		super(name);
	}

}
