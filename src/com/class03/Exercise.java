package com.class03;

public class Exercise {

	public static void main(String[] args) {

		double a = 4;
		double b = 6;
		
		if (a < b) {
			System.out.println("Double value " + a + " is larger than " + b + ".");
		}
		else {
			System.out.println("is false");
		}
		System.out.println("##################");
		
		int temp = 56;

		
		if (temp < 32) {
			System.out.println("Water will freeze with temperature " + temp);
		}
		else {
			System.out.println("Water will NOT freeze with temperature " + temp);
		}
		
		System.out.println("########################");
		
		boolean val = false;
		
		if (val == true) {
			System.out.println("hello");
		}
		else {
			System.out.println("Bye");
		}
		
		System.out.println("###############");
		System.out.println("##################3");
		
		boolean isRain = false;
		//if it is raining  I will take umbrella, otherwise I go for a walk
		
		if (isRain) {
			System.out.println("I will take umbrella");
		}
		else {
			System.out.println("I go for a walk");
		}
		
		int q = 1;
		int w = 1;
		
		if(q > w) {
			System.out.println("ok");
		}
		else if (q == w) {
			System.out.println("q = w");
		}
		else {
			System.out.println("...");
		}
		
	}

}
