package com.class12;

import java.util.Scanner;

public class FindDuplicatesInArray {

	public static void main(String[] args) 
	{
		int[] array = {1,2,3,4,5,2,5,8,4};
		
		for(int i = 0; i < array.length; i++) 
		{
			for(int j = i + 1; j < array.length; j++) 
			{
				if (array[i] == array[j])
				System.out.println(array[j]);
			}
		}
		 String [][]a= {{"Mr","Mrs","Ms","Miss"},
				        {"Smith","Jordan","Jackson","Obama"}};
	        
	        for(String[] x: a) {
	            for(String y:x) {
	                System.out.println(x+" "+y);
	            }
	}
	        System.out.println(" -------------");
	        
	        Scanner inp = new Scanner(System.in);
	        System.out.print("In:");
	        String word = inp.nextLine();
	        //write your code below
	        char[] ch = word.toCharArray();
	        
	       for(int i = 0; i < ch.length; i++){
	             for (int j = 0; j < ch.length; j++){
	                if(ch[i] == ch[j]){
	                   System.out.print(ch[j]);
	                }
	             }
	       }
	        
	}
}
