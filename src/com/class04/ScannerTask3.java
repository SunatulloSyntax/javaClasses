package com.class04;

import java.util.Scanner;

public class ScannerTask3 {

	public static void main(String[] args) {
		Scanner city = new Scanner(System.in);
		
		System.out.println("Please input city");
		String enterCity = city.nextLine();
		
		
		Scanner temperature = new Scanner(System.in);
		
		System.out.println("Please input temperature in Farahneit");
		int temp = temperature.nextInt();
		
		System.out.println("The temperature in the " + enterCity + " in Celcius is " + (temp -32)/1.8);
		
		
	}

}
