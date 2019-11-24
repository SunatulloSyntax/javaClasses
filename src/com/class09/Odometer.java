package com.class09;

public class Odometer {

	public static void main(String[] args) {
		for (int thousands = 0; thousands <= 9; thousands++) 
		{
			for (int hundreds = 0; hundreds <= 9; hundreds++) 
			{
				for (int tens = 0; tens <= 9; tens++) 
				{
					for (int ones = 0; ones <= 9; ones++) 
					{
						System.out.println(""+ thousands  + hundreds + tens + ones);
					}
				}
			}
		}
	}

}
