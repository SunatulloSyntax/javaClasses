package com.review09;

public class Application {

	public static void main(String[] args) {
		int[] arr = {5, 8, 2, 8, 3, 6};
		
		int sum = ArrayManipulation.sumOfArray(arr);
		System.out.println("The sum of the numbers in the array is " + sum);
		
		ArrayManipulation obj = new ArrayManipulation();
		int largest = obj.largestNumber(arr);
		System.out.println("The largest number is " + largest);
		
		System.out.println("-------------------------------------------");
		
		
		int[] ar = {2, 6, 7, 9, 3, 2, 1, 1, 4};
		
		int min = ArrayManipulation2.smallestNumber(ar);
		System.out.println("The smallest number is " + min);
		 
		
		ArrayManipulation2 s = new ArrayManipulation2();
		int sumof =  s.sumOfNum(ar);
		System.out.println("The sum of numbers is " + sumof);
	}

}
