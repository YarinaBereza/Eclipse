package com.groupHW;

public class HW3 {

	public static void main(String[] args) {
		
		/*
		 * Create a 2D array or integer type 
		 * where you will store integer values in 3 rows and 4 columns. 
		 * Develop a program which will calculate the sum of  even and odd numbers for that array.
		 */
		
		int[][] num = { { 5, 72, 90, 5 }, { 89, 7, 12, 76 }, { 1, 34, 65, 94 } };
		
		int sumEv = 0; 
		int	sumOdd = 0;
		for (int r = 0; r < num.length; r++) {
			for (int c = 0; c < num[r].length; c++) {
				if (num[r][c] % 2 == 0) {
					sumEv += num[r][c];
					
				}else {
					sumOdd += num[r][c];
					
				}
			}
		}
		System.out.println(sumEv);
		System.out.println(sumOdd);

	}

}
