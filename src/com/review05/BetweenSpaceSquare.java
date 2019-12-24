package com.review05;

public class BetweenSpaceSquare {

	public static void main(String[] args) {
//		$$$$$
//		$   $
//		$   $
//		$$$$$
		for(int a = 1; a <= 4; a++) 
		{
			for(int b = 1; b <= 5; b++) 
			{
				if(a == 1 || a == 4 || b == 5 || b == 1) 
				{
					System.out.print("$");
				}else 
				{
					System.out.print(" ");
				}
				
				
			}
			System.out.println();
		}
//			for(int) 
//			{
//				
//			}
//		}
//		
		System.out.println("'''''''''''''''''");
//		for(int a = 1; a <= 4; a++) 
//		{
//			for(int b = 1; b <= a; b++) 
//			{
//				System.out.print("$");
//			}
//			for(int c = 1; c <= a; c++) 
//			{
//				System.out.print("$");
//			}
//			System.out.println();
//		}
	}

}
