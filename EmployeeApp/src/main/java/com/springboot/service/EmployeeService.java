package com.springboot.service;

import java.util.List;

import com.springboot.model.Employee;

public interface EmployeeService {
	public List<Employee> getAllEmployee();
	public boolean isEmployeeExist(String emplyeeName);
}
