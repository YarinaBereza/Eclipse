package com.class05;

public class ifWithNoBraces {

	public static void main(String[] args) {
		
		String day = "Friday";
		
		//if no braces java identifies only 1 statement per block (if block or else block)
		
		if (day.equals("Friday"))
			
			System.out.println("Today is a movie day");
		
		System.out.println("Tommorow i have a class at Syntax");

		System.out.println("--------- End of the Program ----------");
	}

}
