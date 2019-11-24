package com.class07;

import java.util.Scanner;

public class ScannerAndLoop {

	public static void main(String[] args) {
		/*ask user to enter name 5 times
		 * and our output should be "Good afternoon    "*/
		Scanner info;
		String name;
		
		info = new Scanner(System.in);
		/*
		int a = 5;
		
		while(a <= 10) 
		{
			
			
		System.out.println("Please enter your name");
		name = info.nextLine();
		
		
		
		System.out.println("Good afternoon " + name);
		a++;
		}
*/
		int a = 1;
		do {
		System.out.println("Please enter your name");
		name = info.nextLine();
		System.out.println("Your name is " + name);
		a++;
		}
		while (a <= 5);
	}

}
