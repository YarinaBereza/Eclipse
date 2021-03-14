package com.class06;

import java.util.Scanner;

public class uuu {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
	    System.out.println("Enter the age of the Child");
	    int num = sc.nextInt();
	    String name = "in Class";
	    
	    switch(num){
	      case 101:
	      name = "Ramesh"; 
	      break;
	      case 102:
	      name = "Mahesh";
	      break;
	      case 103:
	      name = "Mukesh";
	      break;
	      default:
	      System.out.println("Not found Student name: in Class");
	    }
	    System.out.println("Student name: "+name);

	}
}
