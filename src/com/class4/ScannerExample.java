package com.class4;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter your number");
		int number = scan.nextInt();
		
		System.out.println("Entered number is " + number);
		Scanner input = new Scanner(System.in)
				;
		System.out.println("Enter your name");
		String name = input.nextLine();
		
		System.out.println("Good afternoon " + name);
	}

}
