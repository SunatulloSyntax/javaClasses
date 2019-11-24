package com.ExercisesFromCodeDope;

import java.util.Scanner;

public class EvenOrOdd {
//	Define a program to find out whether a given number is even or odd.
	
	protected String isEven() {
		
		boolean isEven = true;
		
		
		Scanner sc = new Scanner(System.in);
		
		 for(int i = 0; i < 10; i++) {
		System.out.println("Enter any number:");
		int a = sc.nextInt();
		
		
		if(a%2 == 0) {
			isEven = true;
		}else {
			isEven = false;
		}
		 }
		
		
		if(isEven) {
			return "It is even";
		}else {
			return "It is odd";
		}
		
		
		
		 
	}
	
	
	public static void main(String[] args) {
		
		EvenOrOdd isEven = new EvenOrOdd();
		String even =isEven.isEven();
		System.out.println(even);
	}

}
