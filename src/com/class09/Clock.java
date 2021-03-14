package com.class09;

public class Clock {

	public static void main(String[] args) {
		
		
		/*for(int a = 0; a < 10; a++) {
			
			for(int b = 0; b <= 9;b++) {
				
				for(int c = 0;c <= 9;c++) {
					
					for(int d = 0; d <= 9; d++) {
						
						System.out.println(a+" "+b+" "+c+" "+d);
					}
				}
			}
		}
		*/
		
		
		System.out.println("---------------Clock------------------");
		
		for (int h = 0; h < 24; h++) {
			
			for(int m = 0; m <= 59; m++) {
				
				if(m<10 && h<10) {
					
					System.out.println("0"+h+":0"+m);
				}else if(h<10 && m>9) {
				
				System.out.println("0"+h+":"+m);
				}else if(h>9 && m<10) {
					System.out.println(h+":0"+m);
				}else {
					System.out.println(h+":"+m);
				}
			}
		}
		
		System.out.println("---------------Clock------------------");
		
for (int h = 0; h < 24; h++) {
			
			for(int m = 0; m <= 59; m++) {
				if(h < 10) {
					if (m < 10) {
						System.out.println("0"+h+":0"+m);
					}else {
						System.out.println("0"+h+":"+m);
					}
						
					}else {
						
						if(m<10) {
							System.out.println(h+":0"+m);
						}else {
							System.out.println(h+":"+m);
							
						}
					}
				}
			}
				
		
	}

}

