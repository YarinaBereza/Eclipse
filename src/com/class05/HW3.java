package com.class05;

import java.util.Scanner;

public class HW3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double num1, num2, num3;
		double lar;

		System.out.println("Enter first Number");
		num1 = sc.nextDouble();
		System.out.println("Enter second Number");
		num2 = sc.nextDouble();
		System.out.println("Enter second Number");
		num3 = sc.nextDouble();

		if (num1 == num2 && num2 == num3) {
			System.out.println("numbers are equal");
		} else {

			if (num1 > num2) {
				if (num1 > num3) {
					lar = num1;
				} else {
					lar = num3;
				}
			} else {
				if (num2 > num3) {
					lar = num2;
				} else {
					lar = num3;
				}

			}
			System.out.println(lar + " is the largest number");

		}
	}
}