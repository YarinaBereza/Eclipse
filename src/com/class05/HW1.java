package com.class05;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Please, enter your birth month");
		
		String month = sc.next();
		
		if(month.equals("December") || month.equals("January") || month.equals("February")) {
			System.out.println("You were born in season winter");
		}else if (month.equals("March") || month.equals("April") || month.equals("May")) {
			System.out.println("You were born in season spring");
		}else if(month.equals("June") || month.equals("July") || month.equals("August")) {
			System.out.println("You were born in season summer");
	}else if (month.equals("September")||month.equals("October")||month.equals("November")){

		System.out.println("You were born in season autumn");
	}
}
}
