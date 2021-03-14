package com.class05;

import java.util.Scanner;

public class HW2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter numbers");

		double num1 = sc.nextDouble();
		double num2 = sc.nextDouble();
		double num3 = sc.nextDouble();

		if (num1 > num2 && num1 > num3) {
			System.out.println(num1 + " is the largest number");
		} else if (num2 > num1 && num2 > num3) {
			System.out.println(num2 + " is the largest number");
		} else if (num3 > num2 && num3 > num1) {
			System.out.println(num3 + " is the largest number");
		}

	}
}