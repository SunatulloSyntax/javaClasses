package com.class4;

import java.util.Scanner;

public class ScannerTask33 {

	public static void main(String[] args) {

		Scanner city = new Scanner(System.in);

		System.out.println("Please input city");
		String enterCity = city.nextLine();

		System.out.println("Please input temperature in Farahneit");
		int temp = city.nextInt();

		System.out.println("The temperature in the " + enterCity + " in Celcius is " + (temp - 32) / 1.8);

	}

}
