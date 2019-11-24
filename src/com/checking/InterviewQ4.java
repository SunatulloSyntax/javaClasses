package com.checking;

public class InterviewQ4 {

	public static void main(String[] args) {
//		How to find out the part of the string from a string? 
//		What is substring? 
		
		
//		Find number of words in string? 
		String s = "                 I go to school.      ";
		String a = s.trim();
		String[] str = a.split(" ");
		System.out.println(str.length);
		for(String n : str) {
			System.out.println(n);
			
		}
		
		
		
		String str3= "How to find out the part of the string from a string";
        
        String str4= "part of";
        
        System.out.println(str3.indexOf(str4));
        System.out.println(str3.substring(10, 20)); // this is substring
        
        String[] arrst= str3.split(" ");
        System.out.println(arrst.length);
		
		
	}

}
