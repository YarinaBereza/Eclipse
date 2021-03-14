package com.groupHW;

public class HW1 {

	public static void main(String[] args) {
		
		/* 
		 * Create a 2D array or integer type 
		 *  and store numbers in 3 rows and 3 columns. 
		 *  Print the sum of all numbers.
		 */
	
		
		int [][] num = {
				{5,72, 90},
				{89, 7, 12},
				{1, 34, 65}	
		};
		
		int sum = 0;
		for(int r = 0; r<num.length; r++) {
			for(int c = 0; c<num[r].length; c++) {
				sum += num[r][c];
			}
		}
		System.out.println(sum);
	

	}

}
