package com.checking;

import java.util.Scanner;

public class Check {

	public static void main(String[] args) {
		
		
		 sayHello("Holly");
		 Add(100,2);
		 int sum = add(2,4);
		 int total = sum * 3;
		 System.out.println(total);
//		String a = "Hhelloo";
//		 for(int i=0; i<a.length(); i++){
//	           System.out.print(a.charAt(i++));
//	   }
	}
		public static void sayHello(String name) {
			System.out.println("Hello " + name);
		}
		
		public static void Add(int a, int b) {
			System.out.println(a+b);
		}
		
		public static int  add(int a, int b) {
			return(a+b);
//			System.out.println(a+b);
//			System.out.println(a*b);
//			System.out.println(a/b);
//			System.out.println(a-b);
		}
}
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		int[][] a = {
//				{5,2,3,7},
//				{1,5,1,1},
//				{8,3,1,2}
//			};
//	//should be 8
//	    int highest = a[0][0];
//	    for(int i = 0; i < a.length; i++)
//	    {
//	      
//	      for(int j = 0; j <= a.length; j++)
//	      {
//	       if(a[i][j] > highest)
//	       {
//	         highest = a[i][j];
//	       }
//	      }
//	      
//	    }System.out.println(highest);

//		 String str = "The Rain have started here";
//		 String str1 = "The rain have started here";
//		 
//		 System.out.println(str.equals(str1));
//		 System.out.println(str1.equalsIgnoreCase(str1));
//		 System.out.println(str.substring(0,3));
//		 
//		 System.out.println(str.trim());
//		 System.out.println(str.replace(" ", " "));
//		 
//		 String a[] = str.split(" ");
//		 for(String b: a) 
//		 {
//			 System.out.println(b);
//		 }
		    
		
		
		
		
		
		
		
		
		
		
		
		
		
		
//		for(int i = 1; i <= 5; i++) 
//		{
//			for(int k = 1; k <= 10; k++) 
//			{
//				for(int a = 1; a <= i-1; a++ ) 
//				{
//					System.out.print(a);
//				}
//			}
//			System.out.println();
//		}
		
//		 int sum;
//		 for(int i = 1; i <= 5; i++)
//	  	  {
//			 sum = i;
//	  	    for(int j = 1; j <= 10; j++)
//	  	    {
//	  	      
//	  	    System.out.print(sum + " ");
//	  	    sum = sum + 1;
//	  	    }
//	  	    for(int a = 1; a <= i-1; a++) 
//	  	    {
//	  	    	System.out.print(sum + " ");
//	  	    	sum = sum + 2;
//	  	    }
//	  	   System.out.println("");
//	  	} 
//		
//		
//
//		  Scanner scan = new Scanner(System.in);
//		  
//		  String[] arr = new String[5];
//		  
//		  for(int i = 0; i < arr.length; i++)
//		  {
//		    arr[i] = scan.next();
//		  }
//		  for(int i = arr.length-1; i >= 0; i--)
//		  {
//		    System.out.println(arr[i]);
//		  }
//		
//		
//		
//		
//		
		
		
		
		
		
		
//		  for(int i = 1; i < 5; i++)
//		  {
//		    for(int j = 1; j < 6; j++)
//		    {
//		      System.out.print(i);
//		    }
//		    System.out.println();
//		  }	
//		  System.out.println("           " );
		  
//		  for (int i = 1; i <= 5; i++) {
//		        for (int j = 1; j <= (5 - i); j++ ) { 
//		        System.out.print(" "); }
//		        
//		        for (int k = 1; k <= i; k++) {
//		        System.out.print(i);
//		        }
//		        System.out.println();}
//		  
//		    System.out.println("");
//		    
//		    for(int i = 1; i <= 5; i++)
//		    {
//		      for(int j = 1; j <= (5-i); j++)
//		      {
//		        System.out.print(" ");
//		      }
//		    
//		      for(int k = 1; k <= i; k++)
//		      {
//		              System.out.print(i);
//		      }
//		      System.out.println();
//		    }
//		  
//		    System.out.println("   ");
		    
//		    for(int i = 1; i <= 4; i++){
//		    	for(int k = 1; k <= 4; k++) 
//		    	{
//		    		if(i == 1 || i == 4 || k == 1 || k == 4) 
//		    		{
//		    		System.out.print("$");
//		    		}
//		    		else 
//		    		{
//		    			System.out.print(" ");
//		    		}
//		    	}
//		   	   
//		    	System.out.println();
//		 }
//		    System.out.println(" ");
//		    
////		   !!!!!
////		   !   !
////		   !   !
////		   !   !
////		   !   !
////		   !!!!!
////		    
//		    for(int a = 1; a <= 6; a++) 
//		    {
//		    	for(int b = 1; b <= 5; b++) 
//		    	{
//		    		if(a == 1 || a == 6 || b == 1 || b == 5) 
//		    		{
//		    		System.out.print("!");
//		    		}
//		    		else 
//		    		{
//		    			System.out.print(" ");
//		    		}
//		    	}
//		    	System.out.println();
//		    }
		    
//		int sum;
//		 for(int i = 1; i <= 5; i++)
//	  	  {
//			 sum = i;
//	  	    for(int j = 1; j <= 10; j++)
//	  	    {
//	  	      
//	  	    System.out.print(sum + " ");
//	  	    sum = sum + 5;
//	  	  }
//	  	   System.out.println("");
//	  	} 
		
//		Scanner scan = new Scanner(System.in);
//	
//		String[] arr = new String[7];
//		
//     	for(int i = 0; i < arr.length; i++) 
//		{
//			System.out.println("Please enter " + (i+1) + " of the week" );
//			arr[i] = scan.next();		
//		}
//		
//		for(int k = 0; k < arr.length; k++) 
//		{
//			System.out.println(arr[k]);
//		}
//		
			
//		
//		Please enter 1 of the week
//		Sunday
//		Please enter 2 of the week
//		Monday
//		Please enter 3 of the week
//		Tuesday
//		Please enter 4 of the week
//		Wednesday
//		Please enter 5 of the week
//		Thursday
//		Please enter 6 of the week
//		Friday
//		Please enter 7 of the week
//		Saturday
//		Sunday
//		Monday
//		Tuesday
//		Wednesday
//		Thursday
//		Friday
//		Saturday
		
//		
//  	    Scanner userInput = new Scanner(System.in);
//
//		String[] arr = new String[7];
//
//		for (int i = 0; i <arr.length; i++) {
//
//			System.out.println("Please enter day " + (i+1) + " of the week");
//			arr[i] = userInput.next();
//		}
//		
//		
//		for(int i=0; i<=arr.length-1; i++){
//			System.out.println(arr[i]);
//		}
		
	  


