package com.groupHW;

public class HW4 {

	public static void main(String[] args) {
		
		/*
		 * Create 2D array of countries: north america countries, south america countries, europe countries, asian countries, african countries.
		 *  Then print all values from that array using 2 different loops 
		 * and calculate how many total countries have been stored.
		 */

		String[][] countries = { { "US", "Canada", "Cuba", "Honduras" },
				{ "Brazil", "Columbia", "Peru", "Argentina", "Bolivia" },
				{ "Ukraine", "France", "Spain", "Italy", "Germany", "UK", "Switzerland" },
				{ "China", "Japan", "Korea", "India" }, { "Nigeria", "Kenya", "South Africa" } };

		int len = 0;

		for (int r = 0; r < countries.length; r++) {
			for (int c = 0; c < countries[r].length; c++) {
				System.out.print(countries[r][c] + " ");
			}
			
			len += countries[r].length;
			System.out.println();
		}
		System.out.println(len);

		System.out.println("-------------------------------------------------------------------");
		
		for(String[]countr:countries) {
			for(String c:countr) {
				System.out.print(c+" ");
			}
			System.out.println();
			
		}
		
	}

}
