package com.class14;

public class MoreMethodExamples {
	
	/*
	 * Create a method that does not take any values
	 * and always return String Hi
	 */
	
	String print() {
		return "HI";
	}
	
	
	/* 
	 * create a method that takes a number
	 * and returns the double of that number 
	 */
	
	double doublNum(double inp) {
		return  inp*2;
		
	}
	
	
	
	void isRaining(boolean isRain) {
		if(isRain) {
			System.out.println("Please take the umbrella");
		}else {
			System.out.println("Please go for a walk");
			
		}
	}
	
	
	void isGreat() {
		for (int i = 0; i<5; i++) {
			System.out.println("Batch 9 is great");
		}
		
	}
	
	double numb(double num1, double num2) {
		if(num1>num2) {
			return num1;
		}else {
			return num2;
		}
	}
	
	void number(double num1) {
		if(num1%2==0) {
			System.out.println("This number is even");
		}else {
			System.out.println("This number is odd");
			
		}
		
		
	}
	
	

	double RetArr(double[] array) {
		double sum = 0;
		for(double element : array) {
			sum+=element;
		}
		return sum;
	}
	
	
	
		boolean isMirror(String str) {
			 String newStr = "";
			 
			 for(int i = str.length()-1; i>=0; i-- ) {
				 System.out.println(i+" "+str.charAt(i)); 
				 newStr+=str.charAt(i);
			 }
			 System.out.println(newStr);
			 
			 if(str.equals(newStr)) {
				 return true; 
			 }else {
				 return false;
			 }	 	 
		}
	}

