package com.class16;

public class IQ5 {

	public static void main(String[] args) {
//		Write a java program to reverse String?
//		Reverse a string word by word? 
		String s = "Welcome to Java class";
		/* to reverse String
		 * split();
		 * step1: split >>> array of String
		 * strep2: use for loop and use decrement to print values
		 */
		String[] arr = s.split(" ");
		for(int i = arr.length-1; i >= 0; i--) {
			System.out.println(arr[i]);
		}
		
		
		
		
		
		
		
		
		
	}

}
