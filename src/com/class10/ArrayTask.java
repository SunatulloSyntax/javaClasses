package com.class10;

public class ArrayTask {

	public static void main(String[] args) 
	{
		char[] array = new char[6];
		array[0] = 'A';
		array[1] = 'B';
		array[2] = 'C';
		array[3] = 'D';
		array[4] = 'E';
		array[5] = 'F';
		System.out.println(array[1]);
		//2nd way
		char[] array1 = {'A','B','C','D','E','F'};
		System.out.println(array1[1]);
		System.out.println("  							   ");
		
		String[] names = new String[7];
		names[0] = "Bulent";
		names[1] = "Andrey";
		names[2] = "Brown";
		names[3] = "Sunatullo";
		names[4] = "Selim";
		names[5] = "Selma";
		names[6] = "Esra";
		System.out.println(names[3]);
		
		String[] names1 = {"Bulent","Andrey","Brown","Sunatullo","Selim","Selma","Esra"};
		System.out.println(names1[3]);
		
		String[] words = new String[5];
		words[0] = "Java";
		words[1] = "Saturday";
		words[2] = "Day";
		words[3] = "coding";
		words[4] = "is";
		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);
		
		String[] words1 = {"Java", "Saturday", "day", "coding", "is"};
		System.out.println(words[1] + " " + words[4] + " " + words[0] + " " + words[3] + " " + words[2]);
		
		
	}

}
