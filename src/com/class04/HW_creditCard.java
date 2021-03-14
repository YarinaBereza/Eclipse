package com.class04;

import java.util.Scanner;

public class HW_creditCard {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		System.out.println(" Do you have a credit card?(true if yes, false if no)");
		
		boolean cred = scan.nextBoolean();
		  
		if(cred) {
			System.out.println(" What is the balance on your credit card?");
			
			int bal = scan.nextInt();
			if(bal>1000) {
				System.out.println(" You must pay off immediately!");
			}else {
				System.out.println(" You can spend more!");
			}
			
		}else {
			System.out.println(" Do you want to get a credit card?");
		}
		
		

	}

}
