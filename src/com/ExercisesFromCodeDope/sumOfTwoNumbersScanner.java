package com.ExercisesFromCodeDope;

import java.util.Scanner;

public class sumOfTwoNumbersScanner {
//	Write a program to print the sum of two
//	numbers entered by user by defining your own method.
	
	int sumOfTwoNum() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter two numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		return a+b;
		
		
	}
	public static void main(String[] args) {
		sumOfTwoNumbersScanner obj = new sumOfTwoNumbersScanner();
		int result = obj.sumOfTwoNum();
		System.out.println(result);
	}

}
