package com.class22;

public class LocalVariables {

	public static void main(String[] args) {
		// I want to access variable myName from different method
		LocalVariables obj = new LocalVariables();
		obj.sayName();
		System.out.println("/////////////////////////////////");
		String userEmail = obj.createEmail("Sam", "Saeedaliev", "gmail");
		System.out.println(userEmail);
	}
	
	
	void sayName() {
			String myName = "John";
			System.out.println(myName);
//			>>> won't be accessible, scope is only within main method
//			System.out.println(obj);
		
	}
	String createEmail(String name, String lastName, String email) {
		String userEmail = name+lastName+"@"+email+".com";
		return userEmail;
	}
	
}
