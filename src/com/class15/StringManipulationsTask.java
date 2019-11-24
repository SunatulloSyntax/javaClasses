package com.class15;

import java.util.Scanner;

public class StringManipulationsTask {

	public static void main(String[] args) {
		//lets ask user to enter browser
		//based on the input we say "Your selected browser is " ________
		Scanner sc = new Scanner(System.in);
		System.out.println("Please enter browser name");
		String browser = sc.nextLine();
		
		switch(browser.toLowerCase()) {
		case "Firefox":
			System.out.println("Execution be performed " + browser);
			break;
		case "chrome":
			System.out.println("Execution be performed " + browser);
			break;
		case "safari":
			System.out.println("Execution be performed " + browser);
			break;
		default:
			System.out.println("Please enter valid browser");

		}
		
	}

}
