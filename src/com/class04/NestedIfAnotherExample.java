package com.class04;

public class NestedIfAnotherExample {

	public static void main(String[] args) {
	
		boolean morning = false;

		boolean classToday = false;
		
		if(morning) {
			System.out.println("I'm going to work");
		
		}else {
			System.out.println("Let me chack if i have a class today");
			
			if(classToday){
				System.out.println("Iwill attend a class at Syntax");
				
			}else {
				System.out.println("I can relax");
			}
		
		}

	}

}
