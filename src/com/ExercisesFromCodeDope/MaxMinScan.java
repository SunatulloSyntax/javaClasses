package com.ExercisesFromCodeDope;

import java.util.Scanner;

public class MaxMinScan {
	
	
	
	
	
	public static void min() {
		int min = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter 3 numbers:");
		int a = sc.nextInt();
		int b = sc.nextInt();
		int c = sc.nextInt();
		
		if(min < a  && a < b && a < c) {
			min  = a;
		}else if(min < b && b < a && b < c) {
			min = b;
		}else if(min < c && c < b && c < a) {
			min = c;
		}
		System.out.println("The minimum number is " + min);

		
	}
	
	public void max() {
		
		
	}

	public static void main(String[] args) {
		MaxMinScan.min();
		
	}

}
