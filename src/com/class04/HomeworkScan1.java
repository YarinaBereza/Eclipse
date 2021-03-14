package com.class04;

import java.util.Scanner;

public class HomeworkScan1 {

	public static void main(String[] args) {

		Scanner lon = new Scanner(System.in);
		
		System.out.println("What amount of loan you need?");

		int amount = lon.nextInt();

		if (amount <= 200000) {
			System.out.println("I will lend the money");
		} else {
			System.out.println("Sorry, but you are rejected");
		}	
		
	}

}
