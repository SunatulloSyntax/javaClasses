package com.class18;

import java.util.Scanner;

public class BuiltAndUserDefineMethods {

	public static void main(String[] args) {
		//built in
		String str = "Hello";
		str = str.replace("Hello", "Hi");
		System.out.println(str);
		
		Scanner scan = new Scanner(System.in);
		String scannerString = scan.nextLine();
		System.out.println(scannerString);
		
		BuiltAndUserDefineMethods obj = new BuiltAndUserDefineMethods ();
		
	}

}
