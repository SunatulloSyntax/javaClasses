package com.class18;

import java.util.Scanner;

//Create a method that will take
//2 parameters as a numbers and
//prints which number is larger.
public class Task1 {

	public static void main(String[] args) {
		Task1 largestNum = new Task1();
		largestNum.number(5, 5);
		
//		Task1 evenOrOdd = new Task1();
		largestNum.evenOdd(41);
		
//		Task1 palindrom = new Task1();
		largestNum.palindrome("radar");

	}

	void number(int a, int b) {

		if (a > b) {

			System.out.println(a + " is larger than " + b);
		} 
		else if(b < a) {

			System.out.println(b + " is larger than " + a);
		}else {
			System.out.println(a + " and " + b + " are equal");
		}
		}
	
	
	
		void evenOdd(int a) {
			if(a %2 == 0) {
				System.out.println(a + " is even");
			}else {
				System.out.println(a + " is odd");
			}
		}
		
		
		
		
		void palindrome(String str) {
			String reverse = "";
			
			for(int i = str.length()-1; i >= 0; i--) {
				reverse += str.charAt(i);
			}
			if(str.equalsIgnoreCase(reverse)) {
				System.out.println(str + " is palindrome");
			}else {
				System.out.println(str + " is NOT palindrome");
			}
			
		}
		
	}
