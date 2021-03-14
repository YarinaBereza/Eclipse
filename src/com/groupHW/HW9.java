package com.groupHW;

public class HW9 {

	public static void main(String[] args) {
		
		// Find the second largest number in the array

		int[] num = { 1, 5, 90, 76, 8, 90};

		int max = 0;

		int max2 = 0;

		for (int i = 0; i < num.length; i++) {

			if (num[i] > max) {

				max2 = max;
				max = num[i];
			
			} else if (num[i] > max2 && num[i]!=max) {
				max2 = num[i];
			}

		}
		
		System.out.println(max);
		System.out.println(max2);
	}

}
