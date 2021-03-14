package com.class04;

import java.util.Scanner;

public class HW_work {

	public static void main(String[] args) {
		
		Scanner work = new Scanner(System.in);
		
		
		System.out.println("Please, enter numbers of worked years");
		
		int years = work.nextInt();
		

		
		System.out.println("Please, enter your annualy salary");
		
		int salary = work.nextInt();

		
		if(years>=5) {
			System.out.println("You are eligible for the bonus");
			if(salary>50000) {
				System.out.println("Your bonus is 5000!");
			}else {
				System.out.println("Your bonus is 3000!");
			}
			
		}else {
			System.out.println("You are not eligible for the bonus");
			
		}
	}

}
