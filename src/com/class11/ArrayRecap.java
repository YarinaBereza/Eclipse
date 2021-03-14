package com.class11;

import java.util.Scanner;

public class ArrayRecap {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		String[] array;
		
		System.out.println("How many String elements would you like to store");
		int size = sc.nextInt();

		array = new String[size];
		
		for(int i = 0; i<size; i++) {
			System.out.println("Please enter a String");
			array[i]=sc.next();
			
			System.out.println("------ Let's see what have we stored -----------");
			
			for(String str:array) {
				System.out.print(str+" ");
			}
			
		}

	}

}
