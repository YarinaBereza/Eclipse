package com.class08;

import java.util.Scanner;

public class Tsk4 {

	public static void main(String[] args) {
		
		/*
		 * Write a program to ask a user to enter item they want to buy and the price of that item. 
		 * Every time user enters money, 
		 * accumulate the amount 
		 * and tell the user how much is left to pay off. 
		 * If user give more money program should return a change. 
		 * Whenever a user done with payments program should say “Thank you for shopping!”
		 */

		Scanner sc = new Scanner(System.in);
		
		int money;
		int sum = 0;

		System.out.println("Enter the item you want to buy");
		String item = sc.next();

		System.out.println("Enter the price of that item");
		int price = sc.nextInt();
		System.out.println("Please pay for the item");
		

		do {
			
			money = sc.nextInt();
			sum+=money;

			if (sum < price) {
				
				int payoff = price - sum;
				
				System.out.println("Please give me " + payoff);
			
			} else if (sum > price) {
				
				int change = sum - price;
				
				System.out.println("You have " + change + " change");
				
				break;
			
			} else {
			
				System.out.println("You got the right amount");
			}
		
		} while (price != sum);
		
		System.out.println("Thank you for shopping!");
	}
}
