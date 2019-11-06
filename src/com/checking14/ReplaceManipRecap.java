package com.checking14;

public class ReplaceManipRecap {

	public static void main(String[] args) {
		String s = "1234!@# Video provides a powerful way to help you prove point."; 
				   
		System.out.println(s.replace("Video", "Audio"));
		System.out.println();
		System.out.println(s.replaceAll("\\W", ""));
		System.out.println();
		System.out.println(s.replaceAll("\\w", ""));
		System.out.println();
		System.out.println(s.replaceAll("[^0-9]", ""));
		System.out.println();
		System.out.println(s.replaceAll("[0-9]", ""));
		System.out.println();
		System.out.println(s.replaceAll("[a-z]", ""));
		System.out.println();
		System.out.println(s.replaceAll("[^a-z]", ""));
		System.out.println("====================================");
		String s1 = "Video provides a powerful way to help you prove point.";
		
		String[] arr = s1.split(" ");
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
		System.out.println("==============");
		
		for(String i : arr) {
			System.out.println(i);
		}
		
		System.out.println("*****************************");
		//How to we find how many sentences are in the following string;
		String s2 = "Today is Sunday. Its a sunny day. And we are having java class";
		String[] s6 = s2.split("\\."); // splits EACH SENTENCE.
		System.out.println("The number of Sentences in the given String is " + s6.length);
		for(String s4 : s6) {
			System.out.println(s4.trim());
		}
		
		String[] a = s2.split(" ");
		
		for(String s9 : a) {
			System.out.println(s9.trim());
			
		}
		System.out.println("The number of Words in the given String is " + a.length);
	//check online for a list of all possible regular expressions for java.
	}

}
