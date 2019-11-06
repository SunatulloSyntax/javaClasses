package com.class12;

public class StringManipulationDemo1 {

	public static void main(String[] args) 
	{
		int a = 2;
		if(a == 20) 
		{
			System.out.println("Number is " + a);
		}else 
		{
			System.err.println("Number was not 20 but is " + a);
		}
		
		System.out.println("-----------");
		
//		.contains();
		
		String sent = "It was raining";
		String sen = "raining";
		System.err.println(sen.contains(sent));
		
		System.err.println(sent.contains("eas"));
		System.out.println("----------------");
		
		//Create two Strings and initialize them with some value
		//implement the following method on those strings.
//		sen.length();
//		sen.equals();
//		sen.contains(s);
//		sen.toUpperCase();
//		sen.toLowerCase();
//		sen.equalsIgnoreCase(sent);
		
		System.out.println(sen.length());
		System.out.println(sen.equals(sent));
		System.out.println(sent.contains(sen));
		System.out.println(sen.toUpperCase());
		System.out.println(sen.toLowerCase());
		System.out.println(sen.equalsIgnoreCase(sent));
		System.out.println(sent.toLowerCase().contains("It was".toLowerCase()));
		
		System.out.println("-------------------------");
		
		String str2 = "It is very hot in the class";
		
		System.out.println("Is this string starts with It = " + str2.startsWith("It"));
		System.out.println("Is this string starts with 'is' = " + str2.startsWith("is",3));
		
		
		
		
		
		
		
		
		
		
	
	}

}
