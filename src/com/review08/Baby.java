package com.review08;

public class Baby {
	String firstName, lastName;
	char gender;
	int weight;
	String hairColor;
	
	void talk() {
		System.out.println("bla bla bla");
	}
	
	void walk(int times) {
		for(int i = 0; i < times; i++) {
		System.out.println("Crawl");
		}
	}
	void cry() {
		System.out.println("Cry every minute");
	}
	
	void displayBabyInfo() {
		System.out.println("Full name is: " + firstName + " " + lastName);
		System.out.print("Gender is: ");
		if(gender == 'M') {
			System.out.println("Boy");
		}else if(gender == 'F'){
			System.out.println("Girl");
		}else {
			System.out.println("Unknown");
		}
		
		System.out.println("Hair color is: " + hairColor);
		
		
	}

}
