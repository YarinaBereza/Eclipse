package com.class10;

public class HW {

	public static void main(String[] args) {

		System.out.println("---------------------1----------------------");
		String[] cars = { "BMW", "Tesla", "Mazda", "Infiniti", "Mustang", "Subaru" };

		for (int i = 0; i < cars.length; i++) {

			System.out.print(cars[i] + " ");
		}

		
		System.out.println();
		System.out.println("---------------------2----------------------");

		String[] animals = { "Tiger", "Cat", "Dog", "Mouse", "Monkey", "Chicken" };

		for (int i = 0; i < animals.length; i++) {
			System.out.print(animals[i] + " ");
		}
		System.out.println();

		for (String an : animals) {

			System.out.print(an + " ");
		}

		
		System.out.println();
		System.out.println("---------------------3----------------------");

		int[] numbers = { 1, 4, 19, 78, 5, 56, 465, 12, 0, 555 };

		int sum = 0;

		for (int i = 0; i < numbers.length; i++) {
			sum += numbers[i];
		}
		System.out.println(sum);

		
		int sum1 = 0;

		for (int num : numbers) {
			sum1 += num;
		}
		System.out.println(sum1);

	}

}
