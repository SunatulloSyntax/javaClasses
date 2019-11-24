package com.class06;

public class Recap {
	public static void main(String[] args) {
		/*
		 * declare the time(1-24) based on the time identify whether it morning,
		 * afternoon, evening or if 1-11 >> morning if 12-15 >> noon if 16-20 >> evening
		 * if >20 >> night
		 */

		int time = 2332;
		String timeOfDay = null;

		if (time >= 1 && time < 11) {
			timeOfDay = "Morning";
		} else if (time > 12 && time < 15) {
			timeOfDay = "Noon";
		} else if (time > 16 && time < 20) {
			timeOfDay = "evening";
		} else if (time > 20 && time <= 24) {
			timeOfDay = "Night";
		} else {
			System.out.println("Your entry is invalid");
			//timeOfDay = "Invalid";
			
		}
		System.out.println("Time of the day " + timeOfDay);

		if (timeOfDay.equals("Morning")) {
			System.out.println("Goooood Morninnnng");
		}
		if (timeOfDay.equals("Noon")) {
			System.out.println("Time to play football");
		}

	}

}
