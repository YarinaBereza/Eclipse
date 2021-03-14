package com.class11;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		double[] array;
		
		double sum = 0;

		System.out.println("How many double elements would you like to store");

		int size = sc.nextInt();

		array = new double[size];

		for (int i = 0; i < size; i++) {

			System.out.println("Please enter a number");
          array[i] = sc.nextDouble();
          sum+=array[i];
		}
            System.out.println(sum);
		
		System.out.println("You entered this array");
		for (double num : array) {
			System.out.print(num + " ");
			
			
		}
	}

}
