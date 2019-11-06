package com.class7;

import java.util.Scanner;

public class Homework2 {

	public static void main(String[] args) {
		 /*You need to ask user to pay for coffee
		 * you need to keep asking user to pay for it untill
		 * entered price is equal = 5
		 * After user paid then say "Enjoy your coffee!"
		 * */
		Scanner info;
		info = new Scanner(System.in);
	/*	int a;
		info = new Scanner(System.in);
		do {
		System.out.println("Please pay for the coffee");
		a = info.nextInt();
		
		}while(a != 5);
		System.out.println("Enjoy your coffee");
	*/	
		int p;
		System.out.println("Please pay for your coffee");
		p = info.nextInt();
		
		while(p != 5) 
		{
		System.out.println("Please pay for your coffee");	
		p = info.nextInt();
		}
		System.out.println("Enjoy your coffee");
	}

}
