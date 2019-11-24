package com.checking;

import java.util.Arrays;

public class InterviewQ2 {

	public static void main(String[] args) {
//		 Write a java program to find the second largest number in the array? 
	   int[] a = {0,0,2,4,3,7,9,12,1,9,10,16,18,18,0,5};
	   int s = a.length;
	   //sort the array
	   Arrays.sort(a);
	   //print
	   System.out.println("The second largest number is " + a[s-2]);
	   System.out.println("///////////////////");
	   
	   // 2nd way
	   System.out.println("The list of numbers in an array: ");
	   System.out.print(Arrays.toString(a) + " ");
	   int max = 0;
	   int max2 = 0;
	   for(int i = 0; i < a.length; i++) {
		   if(a[i] > max) {
			   max2 = max;
			   max = a[i];
		   }
		   if(max2 < a[i] && a[i] < max) {
			   max2 = a[i];
		   }
	   }System.out.println("\n"+"Max number is " + max);
	System.out.println("Second max number is " + max2);
	  
			
//		 Maximum and minimum number in the array? 
	 	 int maxx = 0;
	 	 int min = 0;
	 	 System.out.println("The list of numbers in an array:");
	 	 System.out.println(Arrays.toString(a) + " ");
	 	 
	 	 for(int j = 0; j < a.length; j++) {
	 		 if(a[j] > maxx) {
	 			 maxx = a[j];
	 		 }
	 		 if(a[j] < min) {
	 			 min = a[j];
	 		 }
	 	 }System.out.println("The max number is " + maxx);
	      System.out.println("The min number is " + min);
	 	 	
	     
	}

}
