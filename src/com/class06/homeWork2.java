package com.class06;

import java.util.Scanner;

public class homeWork2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter your grade");
		char grade = sc.next().charAt(0);
		String expl;
		
		switch(grade) {
		case 'A':
			expl = "Excellent";
			break;
		case 'B':
			expl = "Good";
			break;
		case 'C':
			expl = "Avarage";
			break;
		case 'D':
			expl = "Bad";
			break;
			default:
				expl = "Not Acceptable";
		}
		System.out.println("Your grade is "+grade+ " and it is "+expl); 

	}

}
