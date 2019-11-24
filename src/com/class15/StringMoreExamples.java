package com.class15;

public class StringMoreExamples {

	public static void main(String[] args) {
		String str = "Syntax Technologies";
		
		char letter = str.charAt(5);
		System.out.println(letter);
		System.out.println(str.length());
		//length = 19
		System.out.println(str.charAt(str.length()-1));
		
		//get a substring from a String
		//Syntax
		String substr1 = str.substring(0,6);
		System.out.println(substr1);
	}

}
