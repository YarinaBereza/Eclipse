package com.class11;

public class Task3 {

	public static void main(String[] args) {
	
		String [][] arr = { 
				
				{"Yarina ", "Artem ", "Sasha", "Luda"},
				{"A", "B", "C", "D"},
				{"Ahjhjk;", "Bdfgg", "Couyt", "Dhjk", "kglf"},
				{"Arrr", "Biiii", "Chhhh", "Dlllll"},
				{"Ao", "Bh", "Cs", "Dh"}        
		};
		
		System.out.println(arr.length); //5 total single arrays/ 5 rows total
		System.out.println(arr[0].length); //4 elements inside 1 array/4 columns in 1 row
		System.out.println(arr[1].length); //4 elements inside 2 array/4 columns in 2 row
		System.out.println(arr[2].length); //5 elements inside 3 array/4 columns in 3 row
		System.out.println(arr[3].length); //4 elements inside 4 array/4 columns in 4 row
		
		
		for(int r = 0; r<arr.length; r++) {
			for(int c = 0; c<arr[r].length; c++) {
				System.out.print(arr[r][c]+" ");
			}
			System.out.println();
		}
	}

}
