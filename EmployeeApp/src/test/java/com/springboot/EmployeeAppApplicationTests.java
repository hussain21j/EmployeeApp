package com.springboot;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class EmployeeAppApplicationTests {

	private StringBuilder myString;
	private static String myClassString;
	
	@BeforeClass
	//this method
	public static void beforeClassInitializaton(){
		myClassString = "Before class initializaton of class";
		System.out.println(myClassString);
	}
	
	@AfterClass
	public static void decomposeClass(){
		myClassString = "After class initializaton of class";
		System.out.println(myClassString);
	}
	
	
	@Before
	public void initialization(){
		myString = new StringBuilder();
		myString.append("at before every test method");
		System.out.println(myString);
	}
	
	@Before
	public void decompose(){
		myString = new StringBuilder();
		myString.append("at after every test method");
	}
	
	
	
	@Test
	public void contextLoads() {
		//Fail.fail("not yet implemented");
		Assert.assertEquals("test", "test");
	}
	
	@Test
	public void contextLoads2() {
		//Fail.fail("not yet implemented");
		Assert.assertTrue(true);
	}

}
