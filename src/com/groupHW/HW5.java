package com.groupHW;

public class HW5 {

	public static void main(String[] args) {
		
		// Swap 2 numbers without a temporary variable

		int a = 4;
		int b = 8;

		a = a + b;
		b = a - b;
		a = a - b;

		System.out.println("a after swapping = " + a + " and b after swapping = " + b);

	}

}
