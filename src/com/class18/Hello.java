package com.class18;

public class Hello {
	void sayHello(String name) {
		
	}

	public static void main(String[] args) {
		Hello obj = new Hello();
		obj.sayHello("Asel");
		obj.sayHello("Weqas");
		obj.sayHello("Diego");
		obj.sayHelloDifferentLanguage("USA");
		obj.sayHelloDifferentLanguage("Russia");
		obj.sayHelloDifferentLanguage("Turkey");
		obj.sayHelloDifferentLanguage("tj");
		obj.sayHelloDifferentLanguage("spain");
//		obj.sayHelloDifferentLanguage(123); >>> you will get compile time error

	}
	// Create a method that will say in different language based
	// on the value that will be passed when user calls a method

	void sayHelloDifferentLanguage(String country) {
//		String country = "USA";
//    	 System.out.println("Hi");

		switch (country.toLowerCase()) {
		
		
		case "tj":
			System.out.println("Salom");
		case "usa":
			System.out.println("Hello");
			break;
		case "russia":
			System.out.println("Privet");
			break;
		case "paraguay":
			System.out.println("Hola");
			break;
		case "albania":
			System.out.println("Pershasd");
			break;
		default:
			System.out.println("I don't know how to say hi in your language");
		}
		
		
	}

}
