package com.class13;

public class RegularExpressions {

	public static void main(String[] args) {
		String str = "Hello, \"Class \"";
		System.out.println(str);
		System.out.println("===============");
		//print Hello
		//print only text and not numbers
		String s = "1234Hel324234lo42345";
		System.out.println(s.replaceAll("[0-9]",""));
		
		//print only numbers 
		String s1 = "asdasfsdmaos123akdmsakf456x.>,.zlkcmklz789cxkmzckl";
		System.out.println(s1.replaceAll("[a-z,0-9]",""));
		System.out.println("-------------");
		
		//Remove everything except text and numbers
		String s2 = "Hi12das>@#$%How&*324245";
		System.out.println(s2.replaceAll("\\W", ""));
		System.out.println(s2.replaceAll("[^a-zA-z0-9]", ""));
		System.out.println("------------");
		
		String s3 = "12-22-1990";
		System.out.println(s3.replace('-','/'));
//		System.out.println(s3.replaceFirst("-", "\\"));
	}

}
