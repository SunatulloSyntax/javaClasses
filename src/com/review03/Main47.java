package com.review03;

import java.util.Scanner;

public class Main47 {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		boolean isSunny = scan.nextBoolean();
		int temp;

		if (isSunny) {
			temp = scan.nextInt();
			System.out.println("It is a sunny day, I should go somewhere!");
			if (temp > 85) {
				System.out.println("I am going to the beach");
			} else {
				System.out.println("I am going to the park");
			}
		} else {
			System.out.println("I stay home and practice Java");
		}
	}
}
