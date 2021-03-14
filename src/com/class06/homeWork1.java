package com.class06;

import java.util.Scanner;

public class homeWork1 {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Please enter your country");
	String country = sc.nextLine();
	String language;
	
	switch(country) {
	case "Ukraine":
		language = "Ukrainian";
		break;
	case "USA":
		language = "English";
		break;
	case "Germany":
		language = "German";
		break;
	case "Russia":
		language = "Russian";
		break;
	case "Poland":
		language = "Polish";
		break;
	case "France":
		language = "French";
		break;
	
	case "Spain":
		language = "Spanish";
		break;
	case "Japan":
		language = "Japanese";
		break;
	case "Belarus":
		language = "Belarusian";
		break;
		default:
			language = "Invalid";
	}
	System.out.println("You speak "+language);
	}

}
