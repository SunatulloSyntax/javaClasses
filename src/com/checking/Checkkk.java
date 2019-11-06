package com.checking;

public class Checkkk {

	public static void main(String[] args) {

		
		int[] a = {1,3,3,4,4,5,5,6,6,7,7,7,6};
		int l = 0;
		int sl = 0;
		
		System.out.println("List of numbers in an array:");
		for(int i = 0; i < a.length; i ++) 
		{
			System.out.print(i + " ");
		}
		
		for(int j = 0; j < a.length; j++) {
			if(a[j] > l) {
				sl = l;
				l = a[j];
			}
			if(sl < a[j] && a[j] < l) {
				sl = a[j];
			}
		}System.out.println("\n" + "The first largest number is " + l + "\n" + "The second largest number is " + sl);
			
//		  String word ="abrakadabra";
//	      String replace=word.replaceAll("[^aAeEiIoOuU]", " ");
//	      System.out.println(replace);
//	      System.out.println("===========");
//	      
//	      int a = 1;
//	      int b = 2;
//	      
//	      a = a + b; //3
//	      b = a - b;
//	      a = a - b;
//	      
//	      System.out.println("a = " +a);
//	      System.out.println("b = " + b);
//	      System.out.println("***");
//	      
//	      String i = "123";
//	      String j = "4567";
//	      System.out.println("before i = " + i);
//	      System.out.println("before j = " + j);
//	      
//	      i = i + j; //1234567
//	      j = i.substring(0,i.length() - j.length()); //123
//	      i = i.substring(j.length());
//	      System.out.println("after i = " + i);
//	      System.out.println("after j = " + j);
//	      
	      
	
	      }
	}


