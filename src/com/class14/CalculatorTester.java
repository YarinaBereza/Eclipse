package com.class14;

public class CalculatorTester {

	public static void main(String[] args) {
	
		Calculator calculator = new Calculator();
		System.out.println(calculator.add(10, 12));
		
		System.out.println(calculator.sub(15.5,10));
         double res = calculator.sub(15.5, 10);
         System.out.println(res);
         
         System.out.println(calculator.mul(10, 15));
         System.out.println(calculator.div(89, 50));
	}

}
