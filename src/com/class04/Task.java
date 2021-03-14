package com.class04;

public class Task {

	public static void main(String[] args) {
		
boolean diploma = false;
boolean degree = true;
double score = 3.4;

if(diploma) {
	System.out.println("Congratulations");
}else {
	if(degree) {
		if(score>=3.5) {
			System.out.println("You are eligible for scholarship");
		}else {
			System.out.println("You should have studied harder");
			
		}
	}
}

System.out.println("-------------------------2------------------------------");

double rate = 4.1;
double price = 68888958;

if(rate>4.5) {
	System.out.println("You are not able to buy a house");
	
}else {
	System.out.println("You can buy a house");
	if(price>200000) {
		System.out.println("You will take a loan");
	}else {
		System.out.println("You will pay cash");
	}
}
	}

}

