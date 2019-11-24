package com.checking;

public class InterviewQ6 {

	public static void main(String[] args) {
//		 Write a Java Program to find whether
//		 a String is palindrome or not? 
		String str="AbccbA";
        String rev = "";
         
    
          int length = str.length();
     
          for ( int i = length - 1; i >= 0; i-- ) {
             rev = rev + str.charAt(i);
          }
     
          if (str.equals(rev)) {
             System.out.println(str+" is a palindrome");
          }
          else {
             System.out.println(str+" is not a palindrome");
          }
	}

}
