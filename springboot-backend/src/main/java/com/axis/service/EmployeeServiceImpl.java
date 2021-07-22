package com.axis.service;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.axis.model.Employee;
import com.axis.repository.EmployeeRepository;

@Service
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	public List<Employee> getAllEmployees() {
		return employeeRepository.findAll();
	}

	
	public Employee createEmployee(Employee employee) {
		return employeeRepository.save(employee);
	}

	public Employee getEmployeeById(Long id) {
//	Employee employee = employeeRepository.findById(id)
//	.orElseThrow() -> new ResoureNotFoundException("Employee not exist with id : " + id);
		return null;
	}


	public Employee updateEmployee(Long id, Employee employeeDetails) {
		return null;
	}

	public Map<String, Boolean> removeEmployee(Long id) {
		return null;
	}

}
