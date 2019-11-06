package com.class4;

import java.util.Scanner;

public class ReviewClas {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		
		System.out.println("Do you have credit?");
		boolean credit = info.nextBoolean();
		if(credit) {
			System.out.println("What's balance on the card?");
		}
		else {
			System.out.println("We offer you credit");
		}
		
		int b = info.nextInt();
		
		if(b > 1000) {
			System.out.println("Pay off immediately");
		}
		else {
			System.out.println("You can spend more");
		}
	}

}
