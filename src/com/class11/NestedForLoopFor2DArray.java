package com.class11;

public class NestedForLoopFor2DArray {

	public static void main(String[] args) {
		
		int[][]numbers = {
				{10, 20, 30, 40},
				{90, 80},
				{1, 2, 3, 4, 5, 6, 7}
					
		};
		
		System.out.println(numbers.length); //total numbers of single array
		System.out.println(numbers[1].length);
		
		for (int r = 0; r<numbers.length; r++) {
			
			for(int c = 0; c<numbers[r].length; c++ ) {
				
				System.out.print(numbers[r][c]+" ");
			}
			
			System.out.println();
		}
		System.out.println("------------------------------------------------");
		
		for(int[] array:numbers) {
			
			for(int a :array) {
				
				System.out.print(a+" ");
				
			}
			System.out.println();
		}
		

	}

}
