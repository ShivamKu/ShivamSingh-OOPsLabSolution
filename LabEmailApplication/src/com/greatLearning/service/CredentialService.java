package com.greatLearning.service;


import java.util.Random;

import com.greatLearning.model.Employee;


public class CredentialService {
	
	public String generatePassword() {
		String capitalLetters = "ABCDEFGHIJLKMNOPQRSTUVWXYZ";
		String smallLetters= "abcdefghijklmnopqrstuvwxyz";
		String number ="0123456789";
		String specialCharacters = "!@#$%^&*_=+-/.?<>)";
		
		String values = capitalLetters + smallLetters + number + specialCharacters;
		
		Random random = new Random();
		
		char[] password = new char[8];
		
		//get the requirements out of the way
		password[0] = smallLetters.charAt(random.nextInt(smallLetters.length()));
        password[1] = capitalLetters.charAt(random.nextInt(capitalLetters.length()));
        password[2] = number.charAt(random.nextInt(number.length()));
        password[3] = specialCharacters.charAt(random.nextInt(specialCharacters.length()));

        //populate rest of the password with random chars
        for (int i = 4; i < 8; i++) {
            password[i] = values.charAt(random.nextInt(values.length()));
        }

        //shuffle it up
        for (int i = 0; i < password.length; i++) {
            int randomPosition = random.nextInt(password.length);
            char temp = password[i];
            password[i] = password[randomPosition];
            password[randomPosition] = temp;
        }

        return new String(password);
	}
	
	public String generateEmailAddress(String firstName, String lastName,String department) 
	{
		return firstName+""+ lastName+"@"+department+".abc.com";
	}
	
	public void showCredentials(Employee employee,String email,String password) {
		System.out.println("Dear "+employee.getFirstName() +" your generated credentials are as followed");
		System.out.println("Email ---> "+email);
		System.out.println("Password --> "+password);
		
	}
}
