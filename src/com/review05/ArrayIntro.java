package com.review05;

public class ArrayIntro {

	public static void main(String[] args) {
		int[] a = new int[5];
		a[2] = 7;
		a[4] = 9;
		
		// 1st Way
		int sumArray = 0;
		for(int i = 0; i < a.length; i++) 
		{
			sumArray = sumArray + a[i];
		}
		System.out.println(sumArray);
		
		// 2nd way
		int[] b = {4, 5, 7, 2, 9};
		int sumB = 0;
		for(int i = 0; i < b.length; i++) 
		{
			sumB = sumB + b[i];
		}
		System.out.println(sumB);
		
	}

}
