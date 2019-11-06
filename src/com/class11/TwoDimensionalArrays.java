package com.class11;

public class TwoDimensionalArrays {

	public static void main(String[] args) 
	{
		int[][] arr = new int[3][4];
		
		// 1st row
		arr[0][0] = 1;
		arr[0][1] = 2;
		arr[0][2] = 3;
		arr[0][3] = 4;
		
		// 2nd row
		arr[1][0] = 3;
		arr[1][1] = 3;
		arr[1][2] = 3;
		arr[1][3] = 5;
	    
		// 3rd row
		arr[2][0] = 2;
		arr[2][1] = 4;
		arr[2][2] = 3;
		arr[2][3] = 5;
		System.out.println(arr[1][3]);
		
		//create 2D array of String with 2 and 3 columns
		String[][] names = new String[2][3];
		
		names[0][0] = "Ali";
		names[0][1] = "Vali";
		names[0][2] = "asd";
		
		
		names[1][0] = "asasd";
		names[1][1] = "asdsa";
		names[1][2] = "a";
		
		
		System.out.println(names[1][2]);
		System.out.println("'''''''''''''''''");
		
		
		
		for(String[] n: names) 
		{
			for (String x: n)
			{
				System.out.print(x + " ");
			}
			System.out.println();
		}
		System.out.println("-----------------");
		
		int[][] numbers = 
			{
					{11,12,13,14,15},
					{21,22,23,24,25},
					{31,32,33,34,35}
			};
		System.out.println(numbers[1][4]);
		
		System.out.println("---------");
		
		//To identify the numbers of Rows
		System.out.println("The numbers of Columns are " + numbers.length);
	
		//To identify the numbers of Columns/elements
		System.out.println("The numbers of Rows are " + numbers[0].length);
		
		System.out.println("-------");
		for(int[] i: numbers) 
		{
			for(int j: i) 
			{
				System.out.print(j + " ");
				
			}
			System.out.println();
		}
		System.out.println("===============");
		
		for(int a = 0; a < numbers.length; a++) 
		{
			for(int b = 0; b < numbers[a].length; b++) 
			{
				System.out.print(numbers[a][b] + " ");
			}
			System.out.println();

		}
		
	}

}
