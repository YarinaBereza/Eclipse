package com.class06;

public class Switch {

	public static void main(String[] args) {
		
		
		/* SWITCH RULES
		 *  we CANNOT have duplicate cases
		 *  values MUST match a variable type
		 *  we MUST have break in every case
		 */
		
		/*LIMITATION
		 * switch CANNOT use Relational or Logical Operators (it simply check
		 * switch CANNOT be used with boolean, float, double, long
		 * 
		 */

		int day = 5;
		String weekDay;

		switch (day) { //is a value based

		case 1:
			weekDay = "Monday";
			break;
		case 2:
			weekDay = "Tuesday";
			break;
		case 3:
			weekDay = "Wednnesday";
			break;
		case 4:
			weekDay = "Thursday";
			break;
		case 5:
			weekDay = "Friday";
			break;
		case 6:
			weekDay = "Saturday";
			break;
		case 7:
			weekDay = "Sunday";
			break;
		default:
			weekDay = "Invalid";
			break;
			
		}
		System.out.println("Today is "+weekDay);

	}
}


