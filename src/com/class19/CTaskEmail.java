package com.class19;

public class CTaskEmail {

	//create a method createEmail()
	//Based on provided user name,
	//lastName and email type
	//Adress.Example:johjnsnow@gmail.com
	
	String createEmail(String name, String lastName, String emailType ) {
			String email = name + lastName + "@" + emailType + ".com";
			return email;
	}
	
//	Write a method to return whether given number is prime or not?
	boolean isPrime(int n) {
		boolean test = true;
		for(int i = 2; i < n/2; i++) {
			if(n%i == 0) {
				test = false;
				break;
			}
			
		}
		return test;
	}
	
	/*
	 * Create  class Student that will have a method getGrade. 
	 * Your method should accept the score of a student and return a grade:
score > 90 - A
score >80 - B
score >70 - C
score > 50 - D
anything else - F*/
	char getGrade(int score) {
		char grade = 'a';
		switch(score) {
		
		case 90:
			System.out.println("A");
			break;
		case 80:
			System.out.println("B");
			break;
		case 70:
			System.out.println("C");
			break; 
		case 50:
			System.out.println("D");
			break;
		default:
			System.out.println("F");
		}
		return grade;
	}
}
