package com.review03;

public class AndVSOr {
	public static void main(String[] args) {
		boolean isRain = true;
		int hour = 23;

		if (isRain && hour > 21) {
			System.out.println("stay home");
		} else {
			System.out.println("you can go outside");
		}

		if (!(!isRain || !(hour > 21))) {
			System.out.println("stay home");
		} else {
			System.out.println("you can go outside");
		}

	}

}
