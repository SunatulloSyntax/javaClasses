package com.class02;

public class StringConcatenation {
	public static void main(String[] args) {
		String name = "Sun";
		//Display in console Good morning Sun
		System.out.println("Good morning " + name);
		
		int day = 22;
		//Today is September 22
		System.out.println("Today is September " + day);
		
		String text = "Today is September ";
		System.out.println(text + day);
		
		String name1 = "Sunatullo";
		System.out.println("My name is " + name1);
		
		String city = "Totowa";
		System.out.println("I live in city of " + city);
		
		int number = 2014355624;
		System.out.println("My phone number is " + number);
		System.out.println("                     ");
		System.out.println("                   ");
		String fruit = "banana";
		char dollar = '$';
		double price = 1.99;
		//The price of banana is $1.99
		System.out.println("The price of " + fruit + " is " + price + dollar + "!!!");
		
	}

}
