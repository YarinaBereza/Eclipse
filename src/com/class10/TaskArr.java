package com.class10;

public class TaskArr {

	public static void main(String[] args) {
		
		char[] arr;//declaration
		arr = new char[6];//initialization
		
		arr[0]='A';
		arr[1]='B';
		arr[2]='C';
		arr[3]='D';
		arr[4]='E';
		arr[5]='F';
		
		System.out.println(arr[1]);
		
		
		System.out.println("--------------Another way of creating an array--------------");
		
		char[]grades = {'A','B','C','D','E','F','E','S'};
		
		System.out.println(grades[5]);
		
		
		int size = grades.length;
		System.out.println("size of the array is "+size);
		
		
		//how to print all elements from an array
		
		for(int i = 0; i<size;i++) {
			
			System.out.println(grades[i]);
		}
		
	}

}
