package com.assessment.EmployeeApp.service;

import java.util.List;

import com.assessment.EmployeeApp.entity.Employee;

public interface EmployeeService {

	public Employee addEmployee(Employee employee);
	public List<Employee> getEmployees();
	public Employee updateEmployee(Integer id, Employee employee);
	
	public List<Employee> descendingSalary();
	public List<Employee> getEmployeesBySorting();
}
