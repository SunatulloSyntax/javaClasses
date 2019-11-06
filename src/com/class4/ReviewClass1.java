package com.class4;

public class ReviewClass1 {

	public static void main(String[] args) {
		int n = 9;
		
		if(n > 9 && n < 100) {
			System.out.println("This is 2 digit number");
		}
		else if(n >= 100 && n < 1000) {
			System.out.println("This is 3 digit number");
		}
		else if (n >= 1000 && n < 10000) {
			System.out.println("This is 4 digit number");
		}
		else {
			System.out.println("I don't know");
		}

	}

}
