package com.class12;

public class Task {

	public static void main(String[] args) 
	{
		String[][] names = {
				{"Ali", "Veli", "Deli"},
				{"Tim", "Ann", "John"}
		};
		
		for (int i = 0; i < names.length; i++) {
			for (int j = 0; j < names[i].length; j++) {
				System.out.print(names[i][j] + " ");
			}
			System.out.println();
		}
		System.out.println("---------------------");
		
		for(String[] a: names) 
		{
			for(String b: a) 
			{
				System.out.print(b + " ");
			}
			System.out.println();
		}
	}

}
