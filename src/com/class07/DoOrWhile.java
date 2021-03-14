package com.class07;

import java.util.Scanner;

public class DoOrWhile {

	public static void main(String[] args) {
		
		/*
		 * we play lottery and have a win number which is 17
		 * we need to keeps asking a user to enter any number from 1 to 100
		 * UNTILL correct number is entered
		 */
		
		Scanner sc = new Scanner(System.in);
		int lotteryNumber=17;
		int num;
		
		do {
		System.out.println("Please enter the number from 1 to 100 to win the lottary");
	       num = sc.nextInt();
		}while(num!=lotteryNumber);
		System.out.println("Congratulations!!!");

	}
}


