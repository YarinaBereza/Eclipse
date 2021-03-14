package com.groupHW;

public class HW8 {

	public static void main(String[] args) {
		
		//   Maximum and minimum number in the array

		int[] num = { 5, 72, 90, 5 };

		int min = num[0];
		int max = num[0];
		
		for (int r = 0; r < num.length; r++) {
			
				if (num[r] < min) {
					min = num[r];
				}
				
				if (num[r] > max) {
					max = num[r];
				}
			}
		
		
		System.out.println(min);
		System.out.println(max);

	}
}
