package com.example.demo.utils;

import com.example.demo.entity.Employee;

public interface EmployeUtils {

	public static void commCalculation(Employee emp) {
		Double hra = emp.getEmpSal() * (12.0 / 100);
		Double ta = emp.getEmpSal() * (4.0 / 100);

		emp.setEmpHra(hra);
		emp.setEmpTa(ta);
	}
}
