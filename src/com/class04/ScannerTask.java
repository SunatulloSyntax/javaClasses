package com.class04;

import java.util.Scanner;

public class ScannerTask {

	public static void main(String[] args) {
		Scanner loan = new Scanner(System.in);
				
		System.out.println("What is amount of loan you needed?");
		int num = loan.nextInt();
		
		if (num < 200000) {
			System.out.println("Ok I would lend the money");
		}
		else {
			System.out.println("No I don't want to lend the money");
		}
		
	}

}
