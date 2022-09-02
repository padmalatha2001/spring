package com.conduira.springmvc.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.conduira.springmvc.model.Employee;
import com.conduira.springmvc.service.EmployeeService;

@Controller
public class EmployeeController {

	@Autowired
	private EmployeeService employeeService;

	// @GetMapping(path = "employees/")
	@RequestMapping(path = "/employees", method = RequestMethod.GET)
	public ModelAndView getEmployee() {
		List<Employee> list = employeeService.getAll();
		return new ModelAndView("displayEmployees", "employees", list);
	}
}
