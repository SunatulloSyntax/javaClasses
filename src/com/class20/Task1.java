package com.class20;

public class Task1 {

	public static void main(String[] args) {
		// reate a method that will take 1 parameter
//		as a String and return reversed String. 
//		Method should be visibly only within same package.
		CTask1 task = new CTask1();
		String reverse = task.reverseString("Hi");
		
		System.out.println(reverse);
		
		
//		Create a method that will take a String
//		and return whether String is palindrome or not.
//		Method should be available to all classes within your projects.

		String str = "Andrei";
		boolean palindrome = task.isPalindrome(str);
		System.out.println("Is " + str + " Palindrome? " + palindrome );
		
		
//		Create a method that will take a string and return 
//	    an array of words from that string. Method should be
//	    available only within same class
		
		String[] strArray1 = task.arrayOfWords2("Today is beautiful");
		System.out.println("The length of the sentence is " + strArray1.length);
		for(String word1 : strArray1) {
			System.out.println(word1);
		}
	}

}
