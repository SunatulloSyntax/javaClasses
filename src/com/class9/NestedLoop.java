package com.class9;

public class NestedLoop {

	public static void main(String[] args) 
	{
		for (int i = 1; i <= 3; i++) 
		{
			System.out.println(" >>> I am outer loop");
			for (int j = 1; j <= 3; j++) 
			{
				System.out.println("I am inner loop");
			}
		}
		
		System.out.println("====================");
		
		int row, numberOfStars;
		   
	    for (row = 1; row <= 10; row++) {
	      for(numberOfStars = 1; numberOfStars <= row; numberOfStars++) {
	        System.out.print("*");
	      }
	      System.out.println(); // Go to next line
	    }
	}

}
