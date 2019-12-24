package com.review05;

public class PyramidReverse {

	public static void main(String[] args) {
//		      1
//		     12
//		    123
//		   1234
//		  12345
		for(int a = 1; a <= 5; a++) 
		{
			for(int b = 5 - a; b >= 1; b--) 
			{
				System.out.print(" ");
			}
			
			for(int c = 1; c <= a  ;c++) 
			{
				System.out.print(c);
			}
			System.out.println();
		}
	}

}
