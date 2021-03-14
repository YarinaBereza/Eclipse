package com.class06;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
		/*
		 * we need to calculate final price after the discount
		 * 
		 * we check if there is sale if no sale --> I am not going for shopping if there
		 * is sale we will ask the item we will ask price
		 * 
		 * if price is less than 10 --> apply 5% discount 
		 * if price is between 10 and 100 --> apply 10% discount 
		 * if price is between 100 and 500 --> apply 20% discount
		 * if price is more than 500 --> apply 30%
		 * 
		 * "which item i purchased, what was original price, what discount applies and final price"
		 */

		Scanner sc = new Scanner(System.in);

		double finalPrice = 0.0;
		String discount = null;
		System.out.println("There is sale?");
		boolean sale = sc.nextBoolean();

		if (!sale) {
			System.out.println("I am not going for shopping");
		} else {
			System.out.println("What item you will buy?");
			String item = sc.next();
			System.out.println("What price of this item?");
			int price = sc.nextInt();

			if (price < 10) {
				finalPrice = price-(price * 0.05);
				discount = "5%";
			} else if (price > 10 && price < 100) {
				finalPrice = price -(price * 0.1);
				discount = "10%";
			} else if (price > 100 && price < 500) {
				finalPrice = price-(price * 0.2);
				discount = "20%";

			} else {
				finalPrice = price -(price * 0.3);
				discount = "30%";
			}
			System.out.println("You purchaised " + item + " with original price " + price + " so your discount is "
					+ discount + " and the final price is " + finalPrice);
		}
	}
}
