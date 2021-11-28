package com.greatLearning.model;



public class Employee {

	String firstName;
	String lastName;
	
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	
	public String getFirstName() {
		return firstName;
	}
	
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	public String getLastName() {
		return lastName;
	}
	
	public Employee(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName =lastName;
	}

}
