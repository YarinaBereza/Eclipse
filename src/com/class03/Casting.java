package com.class03;

public class Casting {

	public static void main(String[] args) {
	
		//widening or implicit casting
		double d =10;
		 System.out.println(d);
		 
		 //narrowing or explicit casting
		 int i = (int)12.99;
		 System.out.println(i);
		 
		 byte b=(byte)130;
		 System.out.println(b);
		 
		 int number = 12;
		 double result =number/5;
		 System.out.println(result);
		 //for division always use DOUBLE
		 
		 double newNum = 10;
		 newNum = newNum/3;  //3.3333333333333335
		 System.out.println(newNum);
		 
		 //int num1 = 10+10.5;
		 double num1 = 10+10.5;
		 System.out.println(num1);
		 
		 
	}

}
