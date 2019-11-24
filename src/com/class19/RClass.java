package com.class19;

public class RClass {
	void sum(int num1, int num2) {
		int c = num1 + num2;
		System.out.println("The sum of 2 number is "  + c);	
	}
	
	// create method to display hello 5 times
	void sayHello(int times) {
		for(int i = 0; i < times; i++){
			System.out.println("Hello");
		}
	}
	//create method to say smth # number of times
	void saySomething(String word, int times) {
		for(int i = 0; i < times; i++) {
			System.out.println(word);
		}
	}

}
