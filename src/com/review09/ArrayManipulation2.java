package com.review09;

public class ArrayManipulation2 {
	
	public static int smallestNumber(int[] array) {
		int min = array[0];
		for(int element : array) {
			if(element < min) {
				min = element;
			}
		}
			
		return min;	
	}
	
	protected int sumOfNum(int[] array) {
		int total = 0;
		for(int element : array) {
			total += element;
		}
		
		return total;
		
	}

	

}
