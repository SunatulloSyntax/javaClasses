package com.class7;

public class WhileLoops {

	public static void main(String[] args) {
	/*	int time = 2;

		if (time < 12) // condition is true
		{
			System.out.println("Good morning"); // code executes 1 time
		}
System.out.println("------------------------");
		while (time < 12) // if condition is true
		{
			System.out.println("Good morning"); // code executes infinitely
			time++;
		}
	*/	
		// I want to print GM 5 times
		int i = 12;
		while(i <= 17) 
		{
			System.out.println("Good afternoon");
			System.out.println(i);
			i++;	
			System.out.println(i);
			}
		System.out.println("Outside of while loop");

	}

}
