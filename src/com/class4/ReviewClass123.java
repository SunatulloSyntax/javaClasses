package com.class4;

import java.util.Scanner;

public class ReviewClass123 {

	public static void main(String[] args) {
		Scanner info = new Scanner(System.in);
		
		System.out.println("Please enter numbers of worked years:");
		int nWork = info.nextInt();
		
		if(nWork >= 5 ) {
			
			System.out.println("Please enter annual salary:");
			int annualS = info.nextInt();
			
			System.out.println("Congratulations! You are eligible for the bonus.");
		if(annualS > 50000) {
			System.out.println("The bonus is 5000");
		}
		else {
			System.out.println("Your bonus is 3000");
		}
		}
		else {
			System.out.println("We are sorry, you are not eligible for the bonus.");
		}
	}

}
