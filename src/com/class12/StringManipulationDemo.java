package com.class12;

public class StringManipulationDemo {

	public static void main(String[] args) 
	{
		// There are two ways to create string objects.
		
		//1.
		//String Literal
		String name = "John";
		System.out.println(name);
		System.out.println("The length of name is "+ name.length());
		
		//2.
		//Creating String with new keyword
		String name1 = new String("John1");
		System.out.println(name1);
		
		System.out.println("-------------------------------");
		
//		This method returns the length of this string
//		The length is equal to the number
//		of 16-bit Unicode characters in the string.
		
		int name1Len = name1.length();
		System.out.println("The length of name1Len is " + name1Len);
		System.out.println("----------------");
		
		String str = "Hello World";
		System.out.println("Before: " + str);
		String newStr = str.toLowerCase();
		System.out.println("After: " + newStr);
		String newStr1 = str.toUpperCase();
		System.out.println("After after: " + newStr1);
		
		System.out.println("--------------");
		//equals
		String str1 = "HElLo WoRld";
		
		boolean isEqual = str.equals(str1);
		System.out.println(isEqual);
		System.out.println(str.equalsIgnoreCase(str1));
		
		
		
	}

}
