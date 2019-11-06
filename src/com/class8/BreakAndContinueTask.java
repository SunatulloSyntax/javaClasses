package com.class8;

import java.util.Scanner;

public class BreakAndContinueTask {

	public static void main(String[] args) {
		for (int a = 0; a <= 50; a++)
		{
			if (a % 3 == 0) {
				continue;
			}
			System.out.print(a + " ");
		}
		System.out.println();
		System.out.println("======================");
		
		
		
		Scanner scan = new Scanner(System.in);
		
		for (int z = 1; z <= 10; z++)
		{
			System.out.println("Am I approved for credit card");
			String creditCard = scan.nextLine();
			
			if ( creditCard.equalsIgnoreCase("Yes")) // equalsIgnoreCase >>> when you don’t like 
			{                                        //         to check the case lower case or upper case
				break;
			}
		}
	}

}
