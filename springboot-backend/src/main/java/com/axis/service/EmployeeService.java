package com.axis.service;
import java.util.List;
import java.util.Map;

import com.axis.model.Employee;

public interface EmployeeService {

	public List<Employee> getAllEmployees();
	public Employee createEmployee(Employee employee);
	public Employee getEmployeeById(Long id);
	public Employee updateEmployee(Long id, Employee employeeDetails);
	public Map<String, Boolean> removeEmployee(Long id);
}
