package com.review04;

import java.util.Scanner;

public class Tasks {

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		String name = null;
		int a = 0;
		
		while (a <= 3) 
		{
			System.out.println("Print your name");
			name = scan.nextLine();
			a++;

		}
		System.out.println("Hello " + name);
	

	}

}
