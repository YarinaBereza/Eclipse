package com.class05;

import java.util.Scanner;

public class Tsk {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Please, enter your height in inches");
		
		int height = sc.nextInt();
		
		if(height<60) {
			System.out.println("You are short height person");
		}
		else if(height>=60 && height<=72 ) {
			System.out.println("Yau are medium height person");
		}
		else {
			System.out.println("Yau are tall height person");
		}

	}

}
