package com.greatLearning.service;

import java.util.Scanner;

import com.greatLearning.model.Employee;




public class DriverClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee = new Employee("Harshit","Choudhury");
		CredentialService cs = new CredentialService();
		String generatedEmail;
		String generatedPassword;
		
		System.out.println("Please Enter the Department from the following");
		System.out.println("1. Technical");
		System.out.println("2. Admin");
		System.out.println("3. Human Resource");
		System.out.println("4. Legal");
		
		Scanner sc = new Scanner(System.in);
		int option = sc.nextInt();
		
		switch(option) {
		case 1 :{
			generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"tech");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail,generatedPassword);
			break;
				}
		case 2 :{
			generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"adm");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail,generatedPassword);
			break;
				}
		case 3 :{
			generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"hr");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail,generatedPassword);
			break;
				}
		case 4 :{
			generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(),employee.getLastName().toLowerCase(),"lg");
			generatedPassword = cs.generatePassword();
			cs.showCredentials(employee, generatedEmail,generatedPassword);
			break;
				}
		
		default:{
			System.out.println("Invalid Input");
		
				}
	    }
        sc.close();
	}
}

