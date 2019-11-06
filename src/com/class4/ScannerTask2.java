package com.class4;

import java.util.Scanner;

public class ScannerTask2 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		
		System.out.println("What's your age?");
		int age = a.nextInt();
		
		if (age >= 18) {
			System.out.println("I will issue a driver license to you!");
		}
		else {
			System.out.println("I will offer you get a learners permit!");
		}
	}

}
