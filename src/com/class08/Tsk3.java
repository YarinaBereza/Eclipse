package com.class08;

import java.util.Scanner;

public class Tsk3 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the start point");
		int StPoint = sc.nextInt();

		System.out.println("Enter the end point");
		int EndPoint = sc.nextInt();

		int sumEven = 0;
		int sumOdd = 0;
		if (StPoint < EndPoint) {
			for (int i = StPoint; i <= EndPoint; i++) {

				if (i % 2 == 0) {
					sumEven += i;
				} else {
					sumOdd += i;
				}

			}
			System.out.println("The sum of even numbers is " + sumEven);
			System.out.println("The sum of odd numbers is " + sumOdd);	
		}else {
			for (int i = EndPoint; i <= StPoint; i++) {

				if (i % 2 == 0) {
					sumEven += i;
				} else {
					sumOdd += i;
				}

			}
		}
		System.out.println("The sum of even numbers is " + sumEven);
		System.out.println("The sum of odd numbers is " + sumOdd);	
	
	}

}
