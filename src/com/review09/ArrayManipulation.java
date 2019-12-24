package com.review09;

public class ArrayManipulation {

	
	protected int largestNumber(int[] array) {  // this method is non-static 
												// and CANNOT be called 
		int max = array[0];					// without creating an object of it 
		for(int element : array) {			// in main method
			if(element > max) {
				max = element;
			}
		}
		
		return max;
	}
	
	public static int sumOfArray(int[] array) {     // static method can be called
		int total = 0;							// in the main method without 
											// creating an object of it 
		for(int element : array) {
			total += element;
		}
		
		return total;
	}
	

}
