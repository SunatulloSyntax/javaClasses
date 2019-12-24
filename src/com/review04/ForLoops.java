package com.review04;

public class ForLoops {

	public static void main(String[] args) 
	{
		int sumEven = 0;
	    int sumOdd = 0;
	
		for (int i = 1; i <= 20; i++)
		{
			
			if (i % 2 == 0)
			{
				sumEven += i;
			}
			else 
			{
				sumOdd += i;
			}
		
	}
		System.out.println("The sum of even numbers from 1 to 20 is " + sumEven);
		System.out.println("The sum of odd numbers from 1 to 20 is " + sumOdd);

		System.out.println("=============");
		
	

		int sum = 0;          // The accumulated sum, init to 0
	      double average;       // average in double
	      int lowerbound = 1;
	      int upperbound = 100;

	      // Use a for-loop to sum from lowerbound to upperbound
	      for (int number = lowerbound; number <= upperbound; ++number) {
	            // The loop index variable number = 1, 2, 3, ..., 99, 100
	         sum += number;     // same as "sum = sum + number"
	      }
	
}
}
