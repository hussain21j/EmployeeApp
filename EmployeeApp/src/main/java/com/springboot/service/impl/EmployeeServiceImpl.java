package com.springboot.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.springboot.dao.EmployeeDao;
import com.springboot.model.Employee;
import com.springboot.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService{
	
	@Autowired
	private EmployeeDao employeeDao;
	private ArrayList<Employee> employeeList;
	
	public List<Employee> getAllEmployee(){
		return employeeDao.getAllEmployee();
	}

	@Override
	public boolean isEmployeeExist(String employeeName) {
		boolean isEmployeeExist = false;
		
		if(null == employeeName || employeeName.length()==0){
			isEmployeeExist = false;
		}
		
		for(Employee employee : employeeList){
			if(employeeName.equalsIgnoreCase(employee.getName()))
				isEmployeeExist = true;
		}
		return isEmployeeExist;
	}

	public ArrayList<Employee> getEmployeeList() {
		return employeeList;
	}

	public void setEmployeeList(ArrayList<Employee> employeeList) {
		this.employeeList = employeeList;
	}
	
	
}

