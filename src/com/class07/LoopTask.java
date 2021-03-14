package com.class07;

import java.util.Scanner;

public class LoopTask {

	public static void main(String[] args) {
		
		/* 
		 * I want to capture your name 5 times and say hello to you
		 */
		
		Scanner sc = new Scanner(System.in);
		String name;
		
		int q = 5;
		
		while(q>=1) {
			
			System.out.println("Please enter your name");
			name = sc.nextLine();
			System.out.println("hello "+name);
				q--;
		}
		
	}

}
