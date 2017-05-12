package com.springboot.dao.impl;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springboot.dao.EmployeeDao;
import com.springboot.model.Employee;

@Repository
public class EmployeeDaoImpl implements EmployeeDao {
	
	private List<Employee> employeeList;
	
	@Override
	public List<Employee> getAllEmployee() {
		employeeList = new ArrayList<>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try{
			employeeList.add(new Employee("Janardhan", "SE", "Male", dateFormat.parse("07/06/2013"), 400000));
			employeeList.add(new Employee("Noman", "SE", "Male", dateFormat.parse("07/06/2013"), 500000));
			employeeList.add(new Employee("Sanjeev", "Consultant", "Male", dateFormat.parse("07/06/2013"), 600000));
			employeeList.add(new Employee("Shivi", "ITA", "Female", dateFormat.parse("07/06/2013"), 700000));
			employeeList.add(new Employee("Uminder", "AST", "Male", dateFormat.parse("07/06/2013"), 800000));
		}
		catch (Exception e) {
			System.out.println("Hello");
		}
		return employeeList;
	}

}
