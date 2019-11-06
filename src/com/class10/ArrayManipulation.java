package com.class10;

import java.util.Arrays;

public class ArrayManipulation {

	
	//your class name is Arrays, But there is already another Arrays Class. And when you call Arrays.sort the eclipse does not know which class you mean
	public static void main(String[] args) 
  {
//		String[] a = {"a", "b", "d"};
//		String[] b = {"d", "a", "b"};
//		
	    int[] numbers = {3, 4, 5, 61, 1};
	    
	for(int i:numbers) 
	{
		System.out.print(i + " ");
	}
	System.out.println("------------");
	
	Arrays.sort(numbers);
//	Arrays.sort(numbers);
	for(int i: numbers) 
	{
		System.out.println(i + " ");
	}
	}

}
