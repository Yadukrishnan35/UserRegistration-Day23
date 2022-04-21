package com.bridgelabz;

import java.util.Scanner;

public class UserRegistration {

	@FunctionalInterface
	public interface Validation{
		
		public boolean validateDetails(String name);
			
	}
	public static Validation validateName() {
		
		return data -> data.matches("^[A-Z].*{3,}"); 
	}
	public static Validation validateEmail() {
		 
		return data -> data.matches("^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$");
	}
	
	public static Validation validateMobileNumber() {
		
		return data -> data.matches("91[0-9]{10}");
		
	}
	public static Validation validatePassword() {
		
		return data -> data.matches("^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&-+=()]).{8,}");
	}
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		//Validation of First Name
		System.out.println("Enter the first name:");
		String firstName = sc.nextLine();
		boolean isValidName = UserRegistration.validateName().validateDetails(firstName);
		System.out.println((isValidName == false )? "Invalid First name": " ");
        
		//validation of Last Name
		System.out.println("Enter the last name:");
		String lastName = sc.nextLine();
		isValidName = UserRegistration.validateName().validateDetails(lastName);
		System.out.println((isValidName == false)? "Invalid Last name": "");
		
		//validation of email
		System.out.println("Enter Email id:");
		String email = sc.nextLine();
		boolean isValidEmail = UserRegistration.validateEmail().validateDetails(email);
		System.out.println((isValidEmail == false)? "Invalid Email":" ");
       
		//validation of MobileNumber
		System.out.println("Enter the Mobile Number");
		String mobile = sc.nextLine();
		boolean isValidMobile = UserRegistration.validateEmail().validateDetails(mobile);
		System.out.println((isValidEmail == false)? "Invalid Mobile Number": " ");
	    
		//validation of password
		System.out.println("Enter Your Password:");
		String password = sc.nextLine();
		boolean isValidPassword = UserRegistration.validatePassword().validateDetails(password);
		System.out.println((isValidPassword == false)? "Invalid password": " ");
	    sc.close();
	}

}
