package com.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
//		break keyword breaks/exist the loop
		for (int a = 0; a < 10; a++)
		{
			if(a == 2) 
			{
				break;
			}
			System.out.println(a);
		}
		System.out.println("I am outside of the loop");
		
		System.out.println();
//		continue - it will skip CURRENT iteration
		
		for (int i = 1; i <= 5; i++) 
		{
			if (i == 5)
			{
				continue;
			}
			System.out.println(i);
		}
		System.out.println("I'm outside of the loop");
		System.out.println();
		
//		I want to print nums from 1 to 20 except 5,6,7
		
		for (int x = 0; x <= 20; x++)
		{
			if (x == 5 || x == 6 || x == 7) 
			{
				continue;
			}
			System.out.println(x);
		}
		System.out.println("I'm outside of the loop");
	}

}
