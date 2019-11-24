package com.class16;

public class IQ6 {

	public static void main(String[] args) {
//		Write a Java Program to find whether a String is palindrome or not? 

		String str = "radar";
		char[] arr = str.toCharArray();

		/*
		 * 1. Always think and write how to solve it: 2. Take a numerical example
		 * 
		 * 
		 */
		//
		// arr[0] == arr[arr.length-1]
		// arr[1] == arr[arr.length-2]
		// arr[2] == 3
		//
		boolean flag = true;

		// do a while loop
		// while flag is true palindrome
		// if two chars are not equal flag = false

		int cnt = 0;
		for (int i = 0; i < arr.length / 2; i++) {
			if (arr[i] == arr[arr.length - (i + 1)]) {
				cnt++;
				// System.out.println("here");
			} else {
				System.out.println("Not Palindrome");
				break;
			}
		}
		if (cnt == arr.length / 2) {
			System.out.println("Palindrome");
		}
		System.out.println("====================================================================================");
		// 2nd way
		//
		str = "radar";
		String rev = "";
		int l = str.length();

		for (int i = l - 1; i >= 0; i--) {
			rev = rev + str.charAt(i);

		}

		String output = (str.equals(rev))
				? "palindrome" 
				: "Not palindrome";
		System.out.println(output);

		String output2;
		if (str.equals(rev)) {
			output2 = "palindrome";
		} else {
			output2 = "Not palindrome";
		}
		System.out.println(output2);

		// to check if an integer is palindrome or not
		//
		//
		//

		int a = 123321;

		System.out.println("=======================================================================================");
		char c = 'A';

		output = (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z') 
				? c + " is an alphabet." 
				: c + " is not an alphabet.";

		System.out.println(output);

	}
}
