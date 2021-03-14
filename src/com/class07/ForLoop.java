package com.class07;

public class ForLoop {

	public static void main(String[] args) {
		
		for(int i =1; i<=3; i++) {
			System.out.println("Hello");
		}
		
		System.out.println("----------------PRINT NUMBERS FROM 1 TO 50----------------");
		for(int i =1; i<=50; i++) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("----------------PRINT NUMBERS FROM 10 TO 1---------------");
		
		for(int i = 10; i>=1;i--) {
			System.out.print(i+" ");
		}
		System.out.println();
		System.out.println("----------------- (0 2 4 6 8 10) --------------------------------");
		
		for(int a = 0;a<=10;a+=2) {
			System.out.print(a+" ");
		}
		System.out.println();
		System.out.println("----------------- (5 10 15 20 ...... TILL 50)  --------------------------------");
		
		for(int i=5; i<=50;i+=5) {
			System.out.print(i+" ");
		}
	}

}
