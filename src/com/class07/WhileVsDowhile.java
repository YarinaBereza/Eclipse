package com.class07;

public class WhileVsDowhile {

	public static void main(String[] args) {
		
		System.out.println("----------------   While    ------------------------");
	
		int num = 1;
		
		while(num<=5) {
			System.out.println("Hello");
			num++;
		}
		System.out.println("----------------   Do while    ------------------------");

		
		int num1 = 1;
		
		do {
			System.out.println("Hello");
			num1++;
			
		}while(num1<=5);
		
		
		/*
		    While = first check then execute
		    Do = first execute then check
		    
		    Even when condition is false DO will execute your code AT LEAST ONCE
	
		 */
	}

}
