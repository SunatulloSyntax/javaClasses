package com.review04;

public class DoWhileConitnue {

	public static void main(String[] args) 
	{
		int i = 0; 
		while (i <= 30) 
		{
			if(i %2 == 0) 
			{
				i++;
				continue;
			}
			System.out.println(i);
			i++;
		}
	}

}
