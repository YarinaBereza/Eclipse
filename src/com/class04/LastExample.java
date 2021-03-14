package com.class04;

public class LastExample {

	public static void main(String[] args) {
	
		int age = 17;
		int weight = 15;
		
		if(age>=18) {
			System.out.println("Just check your weight");
			if(weight>110) {
				System.out.println("You can donate");
			}else {
					System.out.println("Sorry, but your weight is too small");
				}
			}
		else {
			System.out.println("You cannot donate");
		}
		
		

	}

}
