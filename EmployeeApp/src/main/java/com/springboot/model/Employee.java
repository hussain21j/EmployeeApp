package com.springboot.model;

import java.util.Date;

public class Employee {
	String name;
	String designation;
	String gender;
	Date dob;
	int salery;
	
	
	public Employee(){
		
	}
	
	
	
	public Employee(String name, String designation, String gender, Date dob, int salery) {
		super();
		this.name = name;
		this.designation = designation;
		this.gender = gender;
		this.dob = dob;
		this.salery = salery;
	}



	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public Date getDob() {
		return dob;
	}

	public void setDob(Date dob) {
		this.dob = dob;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDesignation() {
		return designation;
	}
	public void setDesignation(String designation) {
		this.designation = designation;
	}
	public int getSalery() {
		return salery;
	}
	public void setSalery(int salery) {
		this.salery = salery;
	}
	
	
}
