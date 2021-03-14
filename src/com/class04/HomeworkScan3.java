package com.class04;

import java.util.Scanner;

public class HomeworkScan3 {

	public static void main(String[] args) {
		
		Scanner kmen = new Scanner(System.in);
		
		System.out.println("Please, enter the city");
		String city = kmen.nextLine();
		
		System.out.println("Please, enter the temperature in Fahrenheit");
		int fahrenheit = kmen.nextInt();
		
		double celsius = (fahrenheit-32)/1.8;
		
		String celsiusRound = String.format("%.1f",celsius); //rounding of the result
		
		System.out.println("The temperature in the city "+city+" is "+celsiusRound);
		

	}

}
