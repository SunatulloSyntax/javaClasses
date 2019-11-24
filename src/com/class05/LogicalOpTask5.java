package com.class05;

import java.util.Scanner;

public class LogicalOpTask5 {

	public static void main(String[] args) {
		int quiz, midTerm, finalScores,avg;
		Scanner info;
		
		info = new Scanner(System.in);
		
		System.out.println("Please enter your quiz score");
		quiz = info.nextInt();
		
		System.out.println("Please enter your midTerm score");
	    midTerm = info.nextInt();
		
		System.out.println("Please enter finalScore");
		finalScores = info.nextInt();
		
		avg = (quiz + midTerm + finalScores)/3;
		
		String grade;
		
		if (avg >= 90 && avg <= 100) {
			grade = "A";
		}else if (avg >= 70 && avg < 90) {
			grade = "B";
		}else if (avg >= 50 && avg < 70) {
			grade = "C";
		}else if (avg < 50) {
			grade = "F";
		}
		else {
			grade = "Not valid";
		}
		System.out.println("Your grade is " + grade);

	}

}
