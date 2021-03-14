package com.class09;

import java.util.Scanner;

public class pattern {

	public static void main(String[] args) {

		/*for (int r = 1; r <= 4; r++) {
			
			for (int c = 1; c <= 4; c++) {
				
				if (r == 1 || r == 4 || c == 1 || c == 4) {
					System.out.print("$");
				
				} else {
					System.out.print(" ");
				}
			}
			System.out.println();*/
		for(int i = 1;i<=10;i++){
		      if(i==5 || i==6){
		       continue;
		      }
		      System.out.println(i);
		    }
		}

	}


