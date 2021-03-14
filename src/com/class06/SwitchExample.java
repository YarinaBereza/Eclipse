package com.class06;

public class SwitchExample {

	public static void main(String[] args) {
	
		/*
		 * store gender using M or F
		 * based on the gender we will specify
		 *    if M --> Male
		 *    if F --> Female
		 *    otherwise --> not sure
		 */

		
		char gender = 'F';
		String description;
		
		switch(gender) {
		
		case'M':
			description = "Male";
			break;
		case 'F':
		description = "Female";
		break;
		default:
			description = "N/A";
		}
		System.out.println(description);
		
		
		}
	}


