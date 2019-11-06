package com.class11;

public class TwoArraysDemo2 {
	public static void main(String[] args) 
	{
		String[][] names = 
			{
					{"Ali", "Vali","Alex", "Aba"},
					{"Shoka","Voka","Vaka","Paka"},
					{"Asa","Qewa","Etrs","Even"}
			};
		int lengthO = names.length;
//		System.out.println(length);
		
		int lengthOfColumns = names[0].length;
		System.out.println(lengthOfColumns);
		
		System.out.println("-----------------------");
		for(String[] i: names) 
		{
			for(String j: i) 
			{
				System.out.print(j + " ");
			}
			System.out.println();
		}
	}

}
