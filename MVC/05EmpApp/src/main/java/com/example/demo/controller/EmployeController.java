package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import com.example.demo.entity.Employee;
import com.example.demo.exception.EmployeNotFoundException;
import com.example.demo.service.IEmplyeService;

@Controller
@RequestMapping("/employe")
public class EmployeController {

	@Autowired
	private IEmplyeService service;

	/*
	 * 1.show RegisterPage
	 */

	@GetMapping("/register")
	public String showRegPage() {
		return "Register";
	}

	/*
	 * 2.on click form Submit,Read Data
	 */

	@PostMapping("/save")
	public String saveEmployee(@ModelAttribute Employee emp, Model model) {

		Integer saveEmployee = service.saveEmployee(emp);

		model.addAttribute("EmpID", saveEmployee);

		return "Register";
	}

	// 3.Display All Rows As a table

	@GetMapping("/all")
	public String displayData(Model model, @RequestParam(required = false) String msg) {

		List<Employee> allEmployes = service.getAllEmployes();
		model.addAttribute("EmpList", allEmployes);
		model.addAttribute("msg", msg);

		System.out.println(msg);

		return "EmployeData";
	}

	// 4.Delete Employee based on id

	@GetMapping("/delete")
	public String deleteEmp(@RequestParam Integer id, RedirectAttributes attribute) {

		String msg = null;

		try {
			service.deleteEmployee(id);
			msg = "Employe " + id + " Deleted Sucsessfully";

		} catch (EmployeNotFoundException e) {
			e.printStackTrace();
			msg = e.getMessage();
		}
		attribute.addAttribute("msg", msg);

		return "redirect:all";
	}

	// 5.When we click Edit button the should be in form
	@GetMapping("/edit")
	public String showEdit(@RequestParam Integer id, Model model) {

		Employee employee = service.getOneEmployee(id);

		System.out.println(employee + "**********");

		model.addAttribute("employee", employee);
		return "UpdateEmploye";

	}

	// 6.Update Form data and Submit

	@PostMapping("/update")
	public String updateData(@ModelAttribute Employee emp, RedirectAttributes redirect) {

		System.out.println(emp);

		service.updateEmployee(emp);
		redirect.addAttribute("msg", "Employe " + emp.getEmpId() + " Updated");

		return "redirect:all";
	}

}
