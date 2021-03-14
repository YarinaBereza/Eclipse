package com.class13;

public class Account {
	
	String userName;
	String password;
	double balance;
	String accountNumber;
	boolean isLoggedIn;
	
	public void login(String passedUserNameWhenLogging,String passedPasswordWhenLogging) {
		if(userName.equals(passedUserNameWhenLogging)&&password.equals(passedPasswordWhenLogging)) {
			
			System.out.println("Welcome to bank of America your balance is "+balance);
		}else {
			System.out.println("Username or password is not correct");
		}
	}
	
	public void printInfo() {
		if(isLoggedIn) {
			System.out.println("Your Account number is  is "+accountNumber+ " Your balance is "+balance);
		}
	}
	
	public void printUsernameAndPassword(String UserName, String Password) {
		System.out.println("User name is equals to "+UserName);
	}

}
