package com.class05;

import java.util.Scanner;

public class task {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
int quiz = sc.nextInt();
int midTerm = sc.nextInt();
int finalScores = sc.nextInt();
char grade;
int avScore = (quiz+midTerm+finalScores)/3;

if(avScore>=90) {
	 grade='A';
	
}else if(avScore>=70 && avScore<90) {
	 grade = 'B';
}else if(avScore>=50 && avScore<70) {
	 grade = 'C';
}else {
    grade ='D';
}
System.out.println("Your grade is "+grade);
	}

}
