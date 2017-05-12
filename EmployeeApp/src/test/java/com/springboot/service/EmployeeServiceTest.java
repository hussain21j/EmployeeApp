package com.springboot.service;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.runners.MockitoJUnitRunner;

import com.springboot.dao.EmployeeDao;
import com.springboot.model.Employee;
import com.springboot.service.EmployeeService;
import com.springboot.service.impl.EmployeeServiceImpl;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeServiceTest {
	
	@Mock
	private EmployeeDao employeeDao;
	
	@InjectMocks
	private EmployeeService employeeService = new EmployeeServiceImpl();
	
	@Before
	public void initializeMockito(){
		MockitoAnnotations.initMocks(this);
	}

	
	@Test
	public void testGetAllEmployee(){
		List<Employee> listEmployee = new ArrayList<>();
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
		try{
			listEmployee.add(new Employee("Janardhan", "SE", "Male", dateFormat.parse("07/06/2013"), 400000));
			listEmployee.add(new Employee("Noman", "SE", "Male", dateFormat.parse("07/06/2013"), 500000));
			listEmployee.add(new Employee("Sanjeev", "Consultant", "Male", dateFormat.parse("07/06/2013"), 600000));
			listEmployee.add(new Employee("Shivi", "ITA", "Female", dateFormat.parse("07/06/2013"), 700000));
			listEmployee.add(new Employee("Uminder", "AST", "Male", dateFormat.parse("07/06/2013"), 800000));
		}
		catch (Exception e) {
			// TODO: handle exception
		}
		Mockito.when(employeeDao.getAllEmployee()).thenReturn(listEmployee); 
		Assert.assertEquals(5, listEmployee.size());
	}
	
	
}

