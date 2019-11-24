package com.checking;

import java.util.Arrays;

public class SortingArray {

	public static void main(String[] args) {
		//1 way
		int[] array = {1, -4, -1, -1, 2, 5, 6, 5, 5, 6, 3, -4};
		Arrays.sort(array);
		int min = array[0];
		int max = array[array.length-1];
		
		System.out.println(min);
		System.out.println(max);
		System.out.println("---------------");
		//2 way
		int[] a = {1, -4, -1, -1, 2, 5, 6, 5, 5, 6, 3, -4};
		int largest = 0;
		int smallest = 0;
		int secLargest = 0;
		
		for(int i = 0; i < a.length; i++) {
			if(a[i] > largest) {
				secLargest = largest;
				largest = a[i];
			}
			if(secLargest < a[i] && a[i] < largest) {
				secLargest = a[i];
			}
			if(a[i] < smallest) {
				smallest = a[i];
			}
		}System.out.println("The largest is " + largest);
		 System.out.println("The second largest is " + secLargest);
	     System.out.println("The smallest is " + smallest);
		
	}

}
