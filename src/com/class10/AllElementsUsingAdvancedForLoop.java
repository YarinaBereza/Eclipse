package com.class10;

public class AllElementsUsingAdvancedForLoop {

	public static void main(String[] args) {

		int[] numbers = { 10, 14, 78, 5, 90 };

		// for each, enhanced for loop, advanced for loop USE ONLY WITH ARRAYS!!!!!! OR
		// COLLECTIONS!!!!

		for (int num : numbers) {
			
			if(num%2==0) {
				
				System.out.print(num + " ");
			}
		}

			
		

		System.out.println();

		String[] name = { "Yarina", "Julija", "Artem", "Ludmila" };

		
		for (int i = 0; i < name.length; i++) {

			System.out.print(name[i] + " ");
		}

		
		System.out.println();
		System.out.println("----------------------------");

		for (String n : name) {

			System.out.print(n + " ");
		}
		
		
		
		System.out.println();
		System.out.println("----------------------------");
		
		char[]grades = {'A','B','C','D','E','F','E','S'};
		
		for(char c:grades) {
			System.out.print(c+" ");
		}
	}
}
