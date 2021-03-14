package com.class02;

public class VariableDeclaration {

	public static void main(String[] args) {
		//1 way to create a variable
		short b =200; //create a variable and assign value
		              //declare a variable and initialized
		
		//2 way 
		int sum; //declaration happens ONLY ONCE
		sum = 30; //initialized the variable
		
		sum = 30; //reassign the value
		
		//the same type
		int x,y,z;
		
		x=10;
		y=20;
		z=30;
		 
		//reasign the value x
		x=70;
		System.out.println(x);
		 
		//we are using value of different variable to initialize the 
		int num = 33;
		
		int num2 = num; //33
		System.out.println(num2);
	}

}
