package com.checking14;

public class SplitMethod2 {

	public static void main(String[] args) {
		// How to seperate comma delimated string.
		String str = "If you come to class early,"
					+ "then you can study more, also you can learn more, "
					+ "and you can leave early.";
		
		String[] arr = str.split(",");
		for(String i : arr) {
			System.out.println(i.trim());
		}
		System.out.println();
		for(int j = 0; j < arr.length; j++) {
			System.out.println(arr[j]);
		}
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
		String str1 = "Welcome To Syntax Technologies";
		String[] ar = str1.split(" ", 2); // Splitting the String into 2 pieces
		System.out.println(ar.length);
		
		for(String l : ar) {
			System.out.println(l);
		}
		
		System.out.println("##############################");
		
String strr = "Video provides a p2owerful way to help you prove your point.";
        
        String [] array = strr.split(" ");
        int max = array[0].length();
        
        for(int i=0;i<array.length;i++) {
            array[i].replace(".","");
            if(array[i].length()>max) {
                max = array[i].length(); 
                System.out.println("Longest word in the sentence is " +"<"
                                    +array[i]+">"+" and length is "+array[i].length() );
            }
        }
	}

}
