package com.class04;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in); // creating scanner
		
		//                         TEXT

		System.out.println("Please enter any text");

		String text = scan.nextLine(); // scan.nextLine(); --> captures your input from console
										// once you enter text you must HIT ENTER
										// the text i entered is stored in varuable text
		System.out.println("Text that i entered is - " + text);

		
		
		//                         1 WORD
		
		
		System.out.println("Please enter your name");
		
		String name = scan.next();// captures 1 word till space
		
		System.out.println("Nice to meet you " + name);
		
		
		
		
		//                         NUMBER
		
		System.out.println("Please, enter your age");
		
		int age = scan.nextInt();
		
		System.out.println("My name is " + name+" and I'm "+age+" years old");
		
		
	}

}
