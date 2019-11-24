package com.class07;

public class DoWhile {

	public static void main(String[] args) {
		int n = 10;
		
		while(n <= 7) 
		{
			System.out.println("Hello");
			n++;
		}
		
		
		
		int n1 = 1;
		
		do 
		{
			System.out.println("Bye");
			n1++;
		}
		while (n1 <= 7);
		System.out.println("=================================");
		//print even numbers from 20 to 50 using DO WHILE
		// 1 way
		int a = 20;
		
		do 
		{
			System.out.println(a);
			a += 2;
		}while(a <= 50);
		
		// 2 way
		
		System.out.println("                  ");
		int even = 20;
		do 
		{
			if(even % 2 == 0) {
				System.out.println(even);
			}
			even++;

		}while(even <= 50);
	}

}
