package com.class02;

public class StringVariables {
	public static void main(String[] args) {
		String name = "Sam";
		String lastName = "Saeed";
		char grade = 'A';
		String city = "Totowa";
		String state = "New Jersey";
		long phoneNumber = 2013354323l;
		
		System.out.println(name);
		System.out.println(lastName);
		System.out.println(grade);
		System.out.println(city);
		System.out.println(state);
		System.out.println(phoneNumber);

		city = "Washington DC";
		state = "DC";
		phoneNumber = 213121323423423l;
		grade = 'B';
		System.out.println(city + "\n" + state + "\n" + phoneNumber + "\n" + grade);
		
	}

}
