package com.class12;

public class SingleArrayRecapDemo {

	public static void main(String[] args) 
	{
		int[][] arr = 
			{
					{1,2,3},
					{4,5,6},
					{7,8,9}
			};
		
		for(int[] i:arr) 
		{
			for(int j:i) 
			{
				if(j %2 == 0) 
				{
					System.out.print(j + "-even  ");
				}else 
				{
					System.out.print(j+ "-odd ");
				}
				
			}System.out.println();
			
		}System.out.println("----------------");
		int sum = 0;
		for(int[] a : arr) 
		{
			for(int b : a) 
			{
				sum += b;
			}
		}			System.out.println(sum);

		
	}

}
