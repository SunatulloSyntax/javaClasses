package com.class08;

public class ForLoop {

	public static void main(String[] args) {
		
	    //say good morning 5 times
		//initialize; test condition; increment
		for (int i = 0; i <= 5; i++)
		{
			System.out.print("Good morning" + " ");
		}
		System.out.println("        ");
		//print numbers from 1-10;
		for (int a = 1; a <= 10; a++)
		{
			System.out.print(a + " ");
		}
		System.out.println("         ");
		//print numbers from 10-1
		for (int x = 10; x >= 1; x--)
		{
			System.out.print(x + " ");
		}
		
		System.out.println("                   ");
		
		for (int q = 1; q <= 100; q++)
		{
			System.out.print(q + ", ");
		}
		System.out.println("                         ");
		
		
		for (int w = 100; w >= 1; w--)
		{
			System.out.print(w + " ");
		}
		
		System.out.println("");
		
		for (int z = 20; z >= 1; z -= 2)
		{
			System.out.print(z + " ");
		}
		
		System.out.println("        ");
		
		for(int c = 20; c >= 1; c--)
		{if(c % 2 == 0)
		{
			System.out.print(c + " ");
		}
		}	
		
		System.out.println("  ");
		
		for (int n = 20; n <= 50; n ++)
		{
			if (n % 2 == 1)
			{
			System.out.print(n + " ");
			}
		}
		
		System.out.println("  ");
		
		for(int n1 = 21; n1 <= 50; n1 += 2)
		{
			System.out.print(n1 + " ");
		}
		
		System.out.println(" ");
		System.out.println("==========================================");
		
		int sum = 0;
		for (int s = 1; s <= 5; s++)
		{
			sum = sum + s;
			System.out.print(sum + "+");
		}
		System.out.println();
		System.out.println(sum + " ");
		System.out.println("+++++++++++++++++++++++++++++++");
		
		int sumAll = 0;
		for (int b = 0; b <= 20; b += 5)
		{
			sumAll = sumAll + b;
			System.out.print(sumAll + "   ");
		}
		System.out.println(sumAll);
		
		int x =1;
		
		for (int i = 1; i<10;i+=2)
		{
			x = x* i;
		}
		System.out.println(x);
		System.out.println("0000000000000000000000000000000000000");
		
		int total=2;
		for (int y=1; y<=3; y++)
		{
			total=total*y; // 2=2*1; 4=2*2;  12=4*3
		}
		System.out.println(total);
		System.out.println();
		System.out.println("/////////////////////////////////////////////");
		System.out.println();
		
	}
	

}
