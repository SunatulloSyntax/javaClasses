package com.class13;

public class Task1 {

	public static void main(String[] args) {
		String str = "Sunatullo";
		for(int i = str.length()-1; i >= 0; i--) 
		{
			System.out.print(str.charAt(i));
		}
		System.out.println("");
		
		String str1 = "Sunday";
		char[] c = str1.toCharArray();
		for(int i = c.length-1; i >= 0; i--) {
			System.out.print(c[i]);
		}
		
		System.out.println();
		
		String s = "Sunatullo";
		if(!s.isEmpty()) {
			if(s.length() %2 !=0 && s.length() >= 3) {
				
			}
		}
		
		String str2 = "testingh";
		//you have to check if the string is emtpy
		if(!str2.isEmpty())
		{
			//check if number of characters is odd
			if(str2.length()%2!=0 && str2.length()>=3)
			{
				System.out.println(str2.charAt((str2.length()/2)));
			}
			else {
				System.err.println("Error");
			}
		}
		
		
		
	}

}
