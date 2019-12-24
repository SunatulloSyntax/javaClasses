package com.review05;

import java.util.Scanner;

public class ArrayMaximum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in) ;
		System.out.println("Hey buddy, tell us the size of the array:");
		int size = sc.nextInt();
		
		int[] array = new int[size];
		System.out.println("The size of the array is " + array.length);
		
		// read values into array
		for(int i = 0; i < size; i++) 
		{
			System.out.println("Enter a number");
			array[i] = sc.nextInt();
		}
		
		System.out.println("----------------");
		// print values of the array
		for(int i = 0; i < size; i++) 
		{
			System.out.println(array[i]);
		}
		System.out.println("------------------");
		int max = 0;
		for(int i = 0; i < array.length; i++) 
		{
			if(array[i] > max) 
				
			{
				max = array[i];
			}
			
		}
		System.out.println("The maximum number is " + max);
	}

}
