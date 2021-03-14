package com.class06;

import java.util.Scanner;

public class LogicalRecap {

	public static void main(String[] args) {
		/*
		 * we need to get time based on time we need to identify what is the time of day
		 * if time is between 1 to 11 --> morning if time is between 12 to 13 --> noon
		 * if time is between 14 to 17 --> afternoon if time is between 18 to 21 -->
		 * evening if time is between 22 to 24 --> night
		 */

		Scanner sc = new Scanner(System.in);
		int time;
		String timeOfTheDay = "Invalid";

		System.out.println("Please entertime in 24 hour format");
		time = sc.nextInt();

		if (time >= 1 && time <= 11) {
			timeOfTheDay = "Morning";
		} else if (time >= 12 && time <= 13) {
			timeOfTheDay = "Noon";
		} else if (time >= 14 && time <= 17) {
			timeOfTheDay = "Afternoon";
		} else if (time >= 18 && time <= 21) {
			timeOfTheDay = "Evening";
		} else if (time >= 22 && time <= 24) {
			timeOfTheDay = "Night";
		}
		System.out.println("Time of the day is "+timeOfTheDay);
		
		/*compiler can initialize variables to their default values
		 * default value of int --> 0
		 * default value of double --> 0.0
		 * default value of boolean --> true
		 * default value of String and all non primitives--> null
		 */
		
		double d = 10;
		System.out.println(d);

	}
}
