package com.groupHW;

public class HW2 {

	public static void main(String[] args) {
		
		/* 
		 * Create a 2D array or integer type 
		 * where you will store odd and even numbers in 3 rows and 4 columns.
		 * Develop a program which will identify/print the even numbers only.
         */
		
		int[][] num = { { 5, 72, 90, 5 }, { 89, 7, 12, 76 }, { 1, 34, 65, 94 } };

		for (int r = 0; r < num.length; r++) {
			for (int c = 0; c < num[r].length; c++) {
				if (num[r][c] % 2 == 0) {
					System.out.print(num[r][c] + " ");
				}
			}
		}

	}

}
