package com.class4;

import java.util.Scanner;

public class ReviewClass12 {

	public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
		
		System.out.println("Are you a boy? true/false");
		boolean isBoy = input.nextBoolean();
		
		System.out.println("Do you have money? true/false");
		boolean hasMoney = input.nextBoolean();
		
		if (isBoy) {
			System.out.println("Yeah, it's a boy");
			if (hasMoney) {
				System.out.println("buy a ferrari");
			} else {
				System.out.println("play soccer");
			}
		} else {
			System.out.println("How old are you?");
			int age = input.nextInt();
			
			System.out.println("Oh no, it's a girl");
			if (hasMoney) {
				System.out.println("buy flowers");
			} else {
				System.out.println("clean the house");
			}
			if (age > 20) {
				System.out.println("you should marry");
			} else {
				System.out.println("you should study");
			}
		}
	}

}
