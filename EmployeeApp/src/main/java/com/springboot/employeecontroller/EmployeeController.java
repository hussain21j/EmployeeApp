package com.springboot.employeecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.model.Employee;
import com.springboot.service.EmployeeService;


@RestController
public class EmployeeController {
	 
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value = "/emplolyee/get", method = RequestMethod.GET)
	public List<Employee> welcomeMethod(){
		return employeeService.getAllEmployee();
	}
	
	@RequestMapping(value = "/emplolyee/{employeeName}")
	public boolean isEmployeeExist(@PathVariable String employeeName){
		return employeeService.isEmployeeExist(employeeName);
	}

}
