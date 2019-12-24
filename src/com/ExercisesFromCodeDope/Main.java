package com.ExercisesFromCodeDope;

import java.util.Scanner;

public class Main {
	 final String reverseString(String str){
		    
		    Scanner sc = new Scanner(System.in);
		    System.out.println("Enter a word");
		    String reverse = sc.nextLine();
		    
		     char[] ch = reverse.toCharArray();
		    for(int i = ch.length-1; i >= 0; i--){
		     System.out.print(ch[i]);
		    }
		   return reverse;
//		    System.out.println(str);
		  }

		public static void main(String[] args){
		  Main a = new Main();
		  a.reverseString("");
		}
}
