package com.checking;

public class InterviewQ3 {

	public static void main(String[] args) {
//		 Find out how many alpha characters present in a string?  
		String a = "Home1^&#@71829&*( and Work2";
		int s = a.length();
		System.out.println("There are " + s + " characters in the string.");
		System.out.println("The alpha characters are:");
		System.out.println(a.replaceAll("[^a-zA-Z]",""));
		String n = a.replaceAll("[^a-zA-Z]","");
		int size = n.length();
		System.out.println("The size of alpha characters is " + size);
		
		System.out.println("The size of alpha characters is " + a.replaceAll("[^a-zA-Z]", "").length());
		System.out.println(a.replaceAll("\\w", "")); //    \\W >>> means remove all special characters
	}												 //     \\w >>> means remove all characters exept special char.

}
