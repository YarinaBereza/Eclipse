package com.class04;

import java.util.Scanner;

public class HomeworkScan2 {

	public static void main(String[] args) {
	

	Scanner scn = new Scanner(System.in);
	
	System.out.println("How old are you?");
	
	int age = scn.nextInt();
	
	if (age>=18) {
		System.out.println(" We will issue a driver license to you");
	}else {
		System.out.println(" We offer you to get a learners permit");
	}
	

	}

}
