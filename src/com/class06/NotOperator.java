package com.class06;

public class NotOperator {

	public static void main(String[] args) {
		
		boolean rain = !true;
		
		if(!rain){
			System.out.println("I will go to the park");
		}
		
		boolean boo = !true;
		System.out.println(boo);
		
		boolean boo1 = !false;
		System.out.println(boo1);
		
		boolean traffic= false;
		if(!traffic) {
			System.out.println("I will come in time");
		}
		
		String day = "Sunday";
		if(!day.equals("Friday")) {
			System.out.println("Today is not Friday");
		}
		
		boolean homework = false;
		if(!homework) {
			System.out.println("I will be happy");
		}
	}

}
