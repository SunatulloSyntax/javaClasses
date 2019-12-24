package com.review03;

import java.util.Scanner;

public class Main36 {
	public static void main(String[] args) {
		String text1, text2;
		int num1, num2;
		Scanner scan = new Scanner(System.in);

		System.out.println("Please enter two strings");
		text1 = scan.next();
		text2 = scan.next();

		System.out.println("Please enter two numbers");
		num1 = scan.nextInt();
		num2 = scan.nextInt();

		if (num1 == num2 && text1.equals(text2)) {
			System.out.println("AND");
		}
		else if (num1 == num2 || text1.equals(text2)) {
			System.out.println("OR");
		}
		else if (num1 != num2 || !text1.equals(text2)) {
			System.out.println("NONE");
		}
		else {
			System.out.println("Will never come here");
		}

	}
}
