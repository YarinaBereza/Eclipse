package com.class06;

import java.util.Scanner;

public class SwitchWithString {

	public static void main(String[] args) {
		
		/*
		 * we need to identify favorite food
		 * 
		 * we need to capture country from a user
		 * based on the country from a user based on the country identify favorite food
		 */

		Scanner input = new Scanner(System.in);
		String country, food;
		
		System.out.println("Please enter your country");
		
		country = input.nextLine();
		
		switch(country.toLowerCase()){
		
		case "usa":
			food = "burger";
			break;
		case "Vietnam":
			food = "Pho";
			break;
		case "poland":
			food = "Pierogi";
			break;
		case "Kazakstan":
			food = "horse";
			break;
		case "Belarus":
			food = "draniki";
			break;
			default:
				food = "Unknown";
		}
		System.out.println("Your favorite food is "+food);
	}

}
