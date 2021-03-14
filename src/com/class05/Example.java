package com.class05;

import java.util.Scanner;

public class Example {

	public static void main(String[] args) {
	
		/*
		 * we have to calculate commision based on sales
		 * 
		 * ask user to enter sale that he made
		 * based on sales we will calculate commission:
		 * if sale between 10 to 100 --> commision is 10%
		 * if sale between 101 to 500 --> commision is 20%
		 * if sale between 501 to 1000 --> commision is 30%
		 * if more than 1000 --> commision is 50%
		 */

		Scanner scan;
		
		double saleAmount, commission;
		
		scan = new Scanner(System.in);
		System.out.println("Please, enter your daily sale amount");
		saleAmount = scan.nextDouble();
		
		if (saleAmount<10) {
			commission = 0;
		}
		
		else if(saleAmount>10 && saleAmount<=100) {
			commission = saleAmount*0.1;
		}
		
		else if (saleAmount>100 && saleAmount<=500) {
			commission = saleAmount*0.2;
		}
		
		else if (saleAmount>500 && saleAmount<=1000){
			commission = saleAmount*0.3;
		}else {
			commission = saleAmount*0.5;
		}
		System.out.println("Your daily commission is "+commission);
		
		if(commission>500) {
			System.out.println("You are an amazing saller");
		}
	}

}
