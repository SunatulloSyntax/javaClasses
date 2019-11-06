package com.checking;

public class InterviewQuestion1 {

    public static void main(String[] args) 
    { 
//    	Write a program to swap 2 numbers without a temporary variable ? Swap 2 strings without a temporary variable?
        int x = 10; 
        int y = 5;
       
        x = x + y; 
        y = x - y; 
        x = x - y; 
        
        System.out.println("After swap x = " + x +" || y = "+ y); 
        System.out.println();
        
        //Using without temporary/extra variable
        String a = "abc";
        String b = "defg";
        System.out.println("Before swap a = " + a);
        System.out.println("Before swap b = " + b);
        System.out.println();
        
        a = a + b; // a = "abcdefg"
//        int la = a.length();
//        int lb = b.length();
        b = a.substring(0, (a.length()-b.length())); // b = "abc"
        a = a.substring(b.length()); //a = "defg"
        System.out.println("After swap a = " + a);
        System.out.println("After swap b = " + b);

        System.out.println("========");
        
        //Using temporary variable/extra variable
        String i, j, z;
        i = "XYZ";
        j = "STUV";
        System.out.println("Before swap:");
        System.out.println("i = " + i);
        System.out.println("j = " + j);
        z = i;
        i = j;
        j = z;
        System.out.println("After swap:");
        System.out.println("a = " + i);
        System.out.println("b = " + j);
        System.out.println();
        
        String q = "Now";  
        String w = "Go";  
        System.out.println("Before swap: " + q + " " + w);  
        q = q + w;  
        w = q.substring(0, q.length() - w.length());  
        q = q.substring(w.length());  
        System.out.println("After : " + q + " " + w);  
    } 

}
