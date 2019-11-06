package com.checking;

import java.util.Scanner;

public class Switch043 {

	public static void main(String[] args) {
		Scanner info;
		String carMake;

		info = new Scanner(System.in);

		System.out.println("Please enter your favorite car make");
		carMake = info.nextLine();
		String carOrigin;
//  IN STRING WE CAN NOT USE ==, BUT WE MUST USE str1.uquals.(str2)
		if (carMake == "BMW") {
			carOrigin = "german car";
		} else if (carMake == "Toyota") {
			carOrigin = "japanese car";
		} else if (carMake == "Maserati") {
			carOrigin = "italian car";
		} else {
			carOrigin = "unknown";
		}
		System.out.println("Your favorite car is " + carOrigin);
	}

}
