package com.class03;

public class Month {

	public static void main(String[] args) {
		int month = 2;
		
		if (month == 1) {
			System.out.println("This month is January");
		} else if (month == 2) {
			System.out.println("This month is February");
		} else if (month == 3) {
			System.out.println("This month is March");
		} else if (month == 4) {
			System.out.println("This month is April");
		} else {
			System.out.println("I don't know ");
		}
		
		int a = 3;
		
		if (a == -1) {
			System.out.println("This number is positive");
		}
		else {
			System.out.println("This number is negative");
		}
		
		int num = 122;
		
		if ((num%2) == 0) {
			System.out.println("This number is even");
		}
		else {
			System.out.println("This number is odd");
		}

	}

}
