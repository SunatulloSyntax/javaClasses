package com.class14;

public class Task {

	public static void main(String[] args) {
//		1.Create a String that will hold a sentence. Write a program to get a new String without any spaces.
		
//		2.Create a String that should be combination of letters, numbers and special characters.
//		Find out how many alpha characters are there in the String.
		
//		3.You have a String a=”Is it saturday? Is it raining? Do we have a Java Class today?”
//		How would you find out how many sentences are in that String?
		
		//1.
		String str = "Today is Sunday.   Today we have Java Class. Today is sunny day";
		System.out.println(str.replace(" ",""));
		System.out.println("============");
		
		//2.
		String str1 = "abA23423c34defg@#$32**(!@";
		String str2 = str1.replaceAll("[^a-zA-Z]", "");
		System.out.println(str2 + " " + str2.length());
		
		//String arr =str1.replaceAll("[^a-zA-Z]", "");
		String a = "Is it Saturday? Is is raining? Do we have a Java sunny day";
		String[] arr = a.split("\\?");
		System.out.println(arr.length);
		for(String i : arr) {
			System.out.println(i.trim());
		}
		
	}

}
