package com.npac.spring.service;

import java.util.List;

import com.npac.spring.model.Employee;

public interface EmployeeService {

	public void addEmployee(Employee p);
	public void updateEmployee(Employee p);
	public List<Employee> listEmployees();
	public Employee getEmployeeById(int id);
	public void removeEmployee(int id);
	
}
