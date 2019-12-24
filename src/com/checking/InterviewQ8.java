package com.checking;

public class InterviewQ8 {

	public static void main(String[] args) {
//		 Write a Java Program to print first
//		 10 numbers of Fibonacci series.
		int first = 0;
		int second = 1;
		int fibbo = first + second;

		for (int i = 0; i < 11; i++) {

			System.out.print(first + " ");
			fibbo = first + second;
			first = second;
			second = fibbo;
//			System.out.print(first + " ");
		}
	}

}
