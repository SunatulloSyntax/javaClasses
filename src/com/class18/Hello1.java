package com.class18;

public class Hello1 {
	void sayHello(String name) {
		System.out.println("Hello " + name);
	}

	public static void main(String[] args) {

		Hello obj = new Hello();
		obj.sayHello("Asel");
		obj.sayHello("Weqas");
		obj.sayHello("Diego");
		obj.sayHelloDifferentLanguage("USA");
		obj.sayHelloDifferentLanguage("Russia");
		obj.sayHelloDifferentLanguage("Turkey");
		// obj.sayHelloDifferentLanguage(123); --> you will get compile time error
	}

	/*
	 * create a method that will say hello in different language based on the value
	 * that will be passed when user calls a method
	 */
	void sayHelloDifferentLanguage(String country) {
		switch (country.toLowerCase()) {

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
			System.out.println("Pershendetje");
			break;
		default:
			System.out.println("I do not know how to say hello in your language");
		}

	}
}
