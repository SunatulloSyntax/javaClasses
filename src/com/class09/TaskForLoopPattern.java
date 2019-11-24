package com.class09;

import java.util.Scanner;

public class TaskForLoopPattern {

	public static void main(String[] args) {
		for (int a = 5; a >= 1; a--) {
			for (int b = 1; b <= a; b++) {
				System.out.print(a);
			}
			System.out.println();
		}
		System.out.println("''''''''''''''''''''''''''''''''''''''''''''''''''''''");

		for (int a = 1; a <= 5; a++) {
			for (int b = 1; b <= a; b++) {
				System.out.print("*");

			}
			System.out.println();
		}
		for (int c = 4; c >= 1; c--) {
			for (int d = 1; d <= c; d++) {
				System.out.print("*");

			}
			System.out.println();
		}
		System.out.println("'''''''''''''''''''''");
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Please enter 1st number");
		int start = scan.nextInt();
		System.out.println("Please enter 2st number");
		int end = scan.nextInt();
		
		int n1 = 0;
		int n2 = 0;
		
		
	
		
		int evenSum = 0;
		int oddSum = 0;
       if (start < end)
       {
		for (int i = start; i <= end; i++) 
		{
			if (i %2 == 0) 
			{
				evenSum += i;
			}
			else 
			{
				oddSum += i;
			}
		}
       }
		else {
		System.out.println("Please enter 1st number lesser that 2nd number");
		
		}
		
		System.out.println("The sum of EVEN numbers is " + evenSum);
		System.out.println("The sum of ODD numbers is " + oddSum);
		
		System.out.println("'''''''''''''");
		
		Scanner info = new Scanner(System.in);
		
		int secret = 7;
		int guessNumber;
		
		do 
		{
			System.out.println("Please guess a number between 1 and 20");
			guessNumber = info.nextInt();
			if (guessNumber > secret) 
			{
				System.out.println("The number is too large, keep guessing");
			}else if (guessNumber < secret) 
			{
				System.out.println("The number is too small, keep trying");
			}
			else 
			{
				System.out.println("Congrats");
			}
		}
		while (guessNumber != secret);
		
		
		
		
	}

}
