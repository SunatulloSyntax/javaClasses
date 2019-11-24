package com.class05;

import java.util.Scanner;

public class LogicalOptask3 {
	public static void main(String[] args) {
		Scanner info;
		int age;
	    info = new Scanner(System.in);
		/*ask user to enter your age
		 * if age is from 1-3 you are a baby
		 * if age is from 3-5 you are toddler
		 * if age is from 5-12 you are a kid
		 * if age is 12-19 you are a teenager
		 * if age 20> you are an adult*/
	    System.out.println("Please eneter your ");
	    age = info.nextInt();
	    
	    String person;
	    
	    if (age > 1 && age < 3) {
	    	//System.out.println("You are a baby");
	    	person = "baby";
	    }else if (age >= 3 && age < 5) {
	    	//System.out.println("You are a toddler");
	    	person = "toddler";
	    }else if (age >= 5 && age < 12) {
	    	//System.out.println("You are a kid");
	    	person = "kid";
	    }else if (age >= 12 && age < 19) {
	    	//System.out.println("You are a teenager");
	    	person = "teenager";
	    }else if (age > 20 && age < 90) {
	    	//System.out.println("You are an adult");
	    	person = "adult";
	    }else {
	    	//System.out.println("Invalid age entered");
	    	person = "Invalid";
	    }
		
		System.out.println("You are " + person);
	}

}
