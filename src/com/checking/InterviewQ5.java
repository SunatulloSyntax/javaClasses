package com.checking;

public class InterviewQ5 {

	public static void main(String[] args) {
		//  Write a java program to reverse String? 
//		    Reverse a string word by word? 
		
		String s = "I go to school";
		String[] a = s.split(" ");
		System.out.println(a);
		for(int i = a.length-1; i >= 0; i--) {
			System.out.println(a[i]);
		}
		
		
		
		
		
		
		String str3= "How to find out the part of the string from a string";
        
        String str4= "part of";
        System.out.println("-------------");
        System.out.println(str3.indexOf(str4));
        System.out.println(str3.substring(10, 20)); // this is substring
        
        String[] arrst= str3.split(" ");
        System.out.println(arrst.length);
        System.out.println("----------------");
        
        //5
        
        for (int i=arrst.length-1;i>=0;i--) {
            System.out.println(arrst[i]);
        }
        }
		
	}


