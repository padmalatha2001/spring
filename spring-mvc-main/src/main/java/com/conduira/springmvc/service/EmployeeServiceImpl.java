package com.conduira.springmvc.service;

import java.util.List;

import com.conduira.springmvc.dao.EmployeeDAO;
import com.conduira.springmvc.model.Employee;

public class EmployeeServiceImpl implements EmployeeService {
	
	private EmployeeDAO employeeDAO;

	public void setEmployeeDAO(EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	public void save(Employee employee) {
		employeeDAO.save(employee);
		
	}

	public Employee getById(int id) {
		return employeeDAO.getById(id);
	}

	public void update(Employee employee) {
		employeeDAO.update(employee);		
	}

	public void deleteById(int id) {
		employeeDAO.deleteById(id);		
	}

	public List<Employee> getAll() {
		return employeeDAO.getAll();
	}

}
