package com.groupHW;

public class HW7 {

	public static void main(String[] args) {
		
		// The first 10 numbers of Fibonacci series.
	
		int n = 10;
		
		int a = 0;
		 
		int b = 1;
		
		int c;
		
		System.out.print(a+" "+b);
		
		for( int i = 0; i<n; i++) {
			
			c = a + b;
			
			System.out.print(" "+c);
			
			a = b;
			
			b = c;
			
		}

	}

}
