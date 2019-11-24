package com.checking;

public class InterviewQ7 {

	public static void main(String[] args) {
//		Write a java program to check whether 
//		a given number is prime or not? 
		 int n=32;
         boolean test=true;
         
         for(int i=2;i<n;i++) {
             
             if (n%i==0) {
                 test= false;
                 break;
             }
             
         }
         if (test) {
             System.out.println(n+ " is a prime number");  
         }else {
             System.out.println(n+ " is not a prime number");
         }
	}

}
