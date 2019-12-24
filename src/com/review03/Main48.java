package com.review03;

import java.util.Scanner;

public class Main48 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String gender;
		int age;
//		System.out.println("Enter gender M/F and age");
		gender = scan.next();
		age = scan.nextInt();

		if (age > 25) {
			if (gender.equals("M")) {
				System.out.println("Man");
			} else if (gender.equals("F")) {
				System.out.println("Woman");
			} else {
				System.out.println("Unknown adult");
			}
		} else {
			if (gender.equals("M")) {
				System.out.println("Boy");
			} else if (gender.equals("F")) {
				System.out.println("Girl");
			} else {
				System.out.println("Unknown kid");
			}
		}

	}
}
