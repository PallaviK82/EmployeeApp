package com.assessment.EmployeeApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.assessment.EmployeeApp.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
	List<Employee> findByOrderBySalaryDesc();
 

}
