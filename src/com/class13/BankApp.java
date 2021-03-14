package com.class13;

public class BankApp {

	public static void main(String[] args) {

		
		Account yrAccount = new Account();
		
		yrAccount.accountNumber = "123";
		yrAccount.userName = "Yarina";
		yrAccount.password = "pass123";
		yrAccount.balance = 1400;
		//yrAccount.login ("Yarina", "pass123");
		
		yrAccount.printUsernameAndPassword ("Yarina", "pass123");

	}

}
