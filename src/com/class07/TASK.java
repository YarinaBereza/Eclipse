package com.class07;

public class TASK {

	public static void main(String[] args) {
		System.out.println();
		System.out.println("------------ EVEN1 ------------------");
		
		for (int i = 20; i >= 1; i--) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("------------ EVEN2 ------------------");
		for (int i = 20; i >= 1; i-=2) {
			if (i % 2 == 0) {
				System.out.print(i + " ");
			}
		}
		System.out.println();
		System.out.println("------------ FROM 1 TO 100 ------------------");
		
		for(int i = 1;i<=100;i++) {
			System.out.print(i + " ");
		}
		for(int i = 1;i<=100;i++) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------ FROM 100 TO 1 ------------------");
		for(int i = 100;i>=1;i--) {
			System.out.print(i + " ");
		}
		System.out.println();
		System.out.println("------------ ODD 1 ------------------");
		
		for (int i = 20;i<=50;i++) {
			if (i % 2 != 0) {
			System.out.print(i + " ");
		}
		}
		System.out.println();
		System.out.println("------------ ODD 2 ------------------");
		
		for (int i = 21;i<=50;i+=2) {
			if (i % 2 != 0) {
				System.out.print(i + " ");
			}
		}
	}
}
