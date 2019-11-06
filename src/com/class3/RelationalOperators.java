package com.class3;

public class RelationalOperators {

	public static void main(String[] args) {

		int num1 = 20;
		int num2 = 19;
		System.out.println(num1 > num2);
		System.out.println(num1 < num2);
		System.out.println("=====================");
		
		double d = 1.99;
		double d1 = 2.99;
		
		boolean b = d > d1;
		System.out.println(b);//false
		
		boolean b1 = d < d1;
		boolean b2 = d == d1;
		boolean b3 = d != d1;
		System.out.println(b1);//true
		System.out.println(b2);//false
		System.out.println(b3);//true
		System.out.println("''''''''''''''''''");
		int a = 20;
		int c = 30;
		//if number a is bigger than number b
		//I want to print a is larger than b
		
		if (a > c) {
			System.out.println("a is larger than c");
		}
		else {
			System.out.println("a is smaller than b");
		}
		
		System.out.println("##########################");
		int expectedHours = 15;
		int ectualHours = 20;
		
		if (expectedHours >= ectualHours) {
			System.out.println("You will succeed!");
		}
		else {
			System.out.println("Please study more...");
		}
		
		
		System.out.println("******************************");
		double teaPrice = 4.99;
		double allowedPrice = 5.99;
		//teaPrice -= 2;
		
		//if price is more than I can afford I will not buy
		// if price is less than what I can afford then I will buy it 
		
		if ( allowedPrice >= teaPrice) {
			System.out.println(" I will buy it ");
			System.out.println("And I will enjoy my tea ");
		}
		else {
			System.out.println("I cannot afford, I need to study more");
			System.out.println("I will go back to study more....");
		}
		System.out.println("I keep writing some code");
	}

}
