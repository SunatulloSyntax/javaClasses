package com.class20;

    

public class CTask1 {
	
	public static void main(String[] args) {
		CTask1 task1 = new CTask1();
		String[] strArray = task1.arrayOfWords("What a beautiful day is today");
		System.out.println("The length of the sentence is " + strArray.length);
		for(String word : strArray) {
			System.out.println(word);
		}
		
		
	}
	
	
	
	
	String reverseString(String s) {   // I can use also protected
		String str = "";
		char[] ch = s.toCharArray();
		for(int i = ch.length-1; i >= 0; i--) {
		    str = str  + ch[i];
		}
		return str;
	}
	
	public boolean isPalindrome(String word) {
		boolean result = false;
		String reverse = reverseString(word);
		
		if(word.equals(reverse)) {
			result = true;
		}else {
			result = false;
		}
		return result;
	}
	
//	Create a method that will take a string and return 
//    an array of words from that string. Method should be
//    available only within same class
	
	private String[] arrayOfWords(String sentence) {
//		String[] stringArray;
//		stringArray = sentence.split(" ");           >>> Long way
//		return stringArray;
		
		return sentence.split(" ");               // >>> Short way
	}


	String[] arrayOfWords2(String sentence) {
//		String[] stringArray;
//		stringArray = sentence.split(" ");           >>> Long way
//		return stringArray;
		
		return sentence.split(" ");               // >>> Short way
	}

	
}
