package com.assessment.EmployeeApp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.data.domain.Sort;
import com.assessment.EmployeeApp.entity.Employee;
import com.assessment.EmployeeApp.exception.EmployeeAlreadyExistsException;
import com.assessment.EmployeeApp.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public Employee addEmployee(Employee employee) {
		if(employeeRepository.existsById(employee.getId())) {
			throw new EmployeeAlreadyExistsException("Employee Already Exists");
		}
		return employeeRepository.save(employee);
	}

	@Override
	public List<Employee> getEmployees() {
		
		return employeeRepository.findAll();
	}

	@Override
	public Employee updateEmployee(Integer id, Employee employee) {
Employee employee2 = employeeRepository.findById(id).get();
		
		if(0 < employee.getSalary()) {
			employee2.setSalary(employee.getSalary());
		}
		
		return employeeRepository.save(employee2);
	}

	@Override
	public List<Employee> descendingSalary() {
	
		return employeeRepository.findByOrderBySalaryDesc();
	}

	@Override
	public List<Employee> getEmployeesBySorting() {
		List<Employee> list = employeeRepository.findAll(Sort.by("salary").descending().and(Sort.by("name")));
		return list;
	}

}
