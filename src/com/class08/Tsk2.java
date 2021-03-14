package com.class08;

import java.util.Scanner;

public class Tsk2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int i = 15;

		while (i < 20) {
			System.out.println("Do you need a credit card?");
			String YesOrNo = sc.next();
			if (YesOrNo.equals("Yes") || YesOrNo.equals("yes" )) {
				break;
			}

		}
		System.out.println("----------------------------------------------------");
		

	}

}
