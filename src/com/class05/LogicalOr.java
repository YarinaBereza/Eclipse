package com.class05;

public class LogicalOr {

	public static void main(String[] args) {
		
		/*
		 * variable day
		 * if day is Tuesday or Wednesday --> Manual class
		 * if day Monday or Friday --> no class
		 * if day Saturday or Sunday --> Java class
		 * if day Thursday --> review class
		 */
		
		String day = "Wednesday";
		
		if (day.equals("Monday") ||  day.equals("Friday")) {
			System.out.println("Today I have no class");
			}
		else if(day.equals("Tuesday") || day.equals("Wednesday")) {
			System.out.println("Today I have Manual class");
		}
		else if (day.equals("Thursday")) {
			System.out.println("Today I have Review class");
		}
		else if(day.equals("Saturday") || day.equals("Sunday")){
			System.out.println("Today I have Java class");
		}
		else {
			System.out.println(day+" is invalid");
		}

	}

}
