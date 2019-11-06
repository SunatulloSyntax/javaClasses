package com.class10;

public class AllValuesFromArray {

	public static void main(String[] args) 
	{
		char[] grades = {'A', 'B', 'C', 'D', 'E', 'F'};
		
		int a = 2;
		System.out.println(grades[4]);
		System.out.println(grades[a]);
		
		a += 2; // 2+2
		System.out.println(grades[a]);			
		a--;
		System.out.println(grades[a]);
		System.out.println(" 					");
		
		for (int i = 0; i < grades.length; i++ ) 
		{
			System.out.println(grades[i]);
		}
		System.out.println(" 												 ");
			 
		String[] animals = {"Cat", "Dog", "Cow", "Snake", "Elephant"};
		int numAnimals = animals.length;
		
		System.out.println(numAnimals);
		for (int i = 0; i < numAnimals; i++) 
		{
			System.out.print(animals[i] + " " + "\n" + "\n");
		}	
		
		// create an array to store 5 double values, print all in 1 line
		
		double[] decimals = {1.1, 2.2, 3.3, 4.8, 5.7};
		int decimalsSize = decimals.length;
		for (int i = decimalsSize-1; i >= 0; i--) 
		{
			System.out.print(decimals[i] + " ");
		}
		
		
		
	}

}
