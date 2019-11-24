package com.class04;

import java.util.Scanner;

public class ReviewClas123 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		
		System.out.println("Do you have credit?  true/false");
		boolean isCredit = info.nextBoolean();
		
		if (isCredit) {
		System.out.println("What's balance on the card?");
		int balance = info.nextInt();
		
		if (balance > 1000) {
			System.out.println("Pay off immediately");
			}
		else {
			System.out.println("You can spend more");
		}
		}
		else {
			System.out.println("We offer you credit");
		}
	}

}
