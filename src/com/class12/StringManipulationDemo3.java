package com.class12;

public class StringManipulationDemo3 {

	public static void main(String[] args) 
	{
		String str = "";
		System.out.println("Is this string empty = " + str.isEmpty());
		String str2 = "Hello";
		System.out.println("Is this string empty =" + str2.isEmpty());
		System.out.println();
		
		if(!str.isEmpty()) 
		{
			System.out.println("This is not empty");
		}else {
			System.err.println("This is empty String");
		}
		
		String sentence = "Each day a promise to brighten up the day, \nBut first you must allow the sun to come your way";
		System.out.println(sentence);
		System.out.println("--------------------------------");
//		
//		This method appends int String to the end of another
//		The method returns a String with the value of the
//		String passed in to the method appended to the end
//		of the String used to invoke this method.
		
		String str3 = "Hello";
		String str4 = "World";
		System.out.println(str3+" " + str4);
		System.out.println(str3.concat(" " +str4));
		System.out.println("---------------------");
//		
//		This method returns a copy of the string,
//		with leading and trailing whitespace omitted
		
		String a = " How are you ? ";
		System.out.println(a.trim());
		
//		-- Returns the character located at the String's specified index
//		The string indexes starts from zero
		
		String b = "We might done be early today";
		System.out.println(b.charAt(3));
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
