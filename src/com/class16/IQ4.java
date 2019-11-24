package com.class16;

public class IQ4 {
	public static void main(String[] args) {
//		 How to find out the part of the string from a string? 
//		What is substring?
//		Find number of words in string? 
		
		String str = "Today is very cold outside";
		String subs = str.substring(0,5);
		System.out.println(subs);
		
		String[] a = str.split(" ");
		for(String b : a) {
			System.out.println(b);
			
		}
		System.out.println(a.length);
	}
}
