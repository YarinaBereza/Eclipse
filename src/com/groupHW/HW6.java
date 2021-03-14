package com.groupHW;

import java.util.Scanner;

public class HW6 {

	public static void main(String[] args) {
		
		// Check whether a given number is prime or not

		Scanner sc = new Scanner(System.in);

		
		System.out.println("Please enter a number");
		
		int number = sc.nextInt();
		boolean cond = true;
		
	   if(number>1) {
	   for(int i = 2; i<number; i++) {
		   
		   if(number%i==0) {
			   cond = false;
			   break;
		}
	   }

	}else {
		cond = false;	
	}
	   if(cond) {
	   System.out.println("It is a prime number");
	   }else {
	   System.out.println("It is NOT a prime number");
	}
}
}


