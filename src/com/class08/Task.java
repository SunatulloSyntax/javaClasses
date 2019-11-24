package com.class08;

public class Task {

	public static void main(String[] args) {
       /*write a code to find the sum of even and odd numbers
        * from range of 1 to 20
        * expecting 2 outputs
        * sum for odd nums=...
        * sum for even nums=...
        */
		
		int sumEven = 0;
		int sumOdd = 0;
		for (int a = 0; a <= 20; a++)
		{
			if(a % 2 != 0)
			{
				sumOdd += a;
//			System.out.println(sumEven + " even");
			}
			else 
			{
				sumEven += a;
//			 System.out.println(sumOdd+ " odd" );

			}
		}
		System.out.println();
		System.out.println("odd nums sum = " +  sumOdd);
		System.out.println("even nums sum = " + sumEven );
		
	}

}
