package com.class4;

public class NestedIftask1 {

	public static void main(String[] args) {
		boolean diploma = true;
		double score = 2.5;

		if (diploma) {
			System.out.println("Congratulations!!!");
			if (score >= 3.5) {
				System.out.println("You are eligible for scholarship");
			} else {
				System.out.println("You should have studied harder");
			}
		} else {
			System.out.println("You should get a degree...");
		}

	}

}
