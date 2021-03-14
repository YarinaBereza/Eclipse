package com.class03;

public class TemperatureCheck {

	public static void main(String[] args) {
		
		int temp = 50;
		
		if(temp<32) {
			System.out.println("Water will freeze with temperature "+temp);
			
		}
		else {
			System.out.println("Water will NOT freeze with temperature "+temp);
		}

		System.out.println("-------------------------------------------------------");
		
		
		
		boolean summer = true;
		if(summer) {
			System.out.println("I'm going to Florida");
		}else {
			System.out.println("I will stay at home");
		}
	}

}

