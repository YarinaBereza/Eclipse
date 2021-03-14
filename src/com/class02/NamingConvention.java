package com.class02;

public class NamingConvention {

	public static void main(String[] args) {

		// keywords - a special word hat reserved in java memory: class, public, static,
		// final, for

		// identifiers - name that we give to classes, variable and methods

		/*
		 * RULE !!! DO NOT USE KEYWORDS AS INDENTIFIERS 
		 * INDENTIFIERS CANNOT CONTAIN SPACE 
		 * INDENTIFIERS CANNOT START WITH NUMBERS 
		 * INDENTIFIERS CANNOT HAVE SPECIAL CHARACTERS: _ OR $
		 */

		// 1. int final = 10; error: INVALID INDENTIFIER

		// 2. byte variable one = 12; NO SPACE

		// 3. short 1b = 12; NUNBER CANNOT BE ON THE FIRST PLACE
		short b1 = 12;
		
		// 4. long *l = 20000;
		
		long _l = 2000;
		long long_ = 28999;
		
		double $price = 12.99;
		double price$ = 10.99;
		
		//NamingConvention
		   // 1. we use vamel casing
		   // 2. classes starts with Upper cases and will follow camel casing
		   // 3. variable start with lower case and will follow camel casing
		   // 4. packages we use lover case and use name as reverse way of url
		   // 5. use meaningful name for your variables
		
		int Number = 12; //try to use uppercase names
				int number = 12; //more prefarable
				
				int numberOne = 12;
				int numberTwo = 13;
				
				boolean isSnow = true;
				boolean snow = true;
				
				double applePrice = 12.99;
				double mangoPrice = 13.89;

	}

}
