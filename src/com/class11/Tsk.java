package com.class11;

public class Tsk {

	public static void main(String[] args) {

		String[][] cars = { { "Ford", "GMS", "Tesla", "Chevrolet" },
				{ "BMV", "Volkswagen", "Audi", "Mercedez", "Opel" }, { "KIA", "Hundai" },
				{ "Fiat", "Ferrari", "Lamborgini" } };

		for (int r = 0; r < cars.length; r++) {
			for (int c = 0; c < cars[r].length; c++) {
				System.out.print(cars[r][c] + " ");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------------");

		for (String[] car : cars) {
			for (String c : car) {
				System.out.print(c + " ");
			}
			System.out.println();
		}

	}

}
