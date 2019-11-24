package com.class24;

public class ThisWithConstructor {
	
	ThisWithConstructor(){
//		this(""); // used to call 2nd constructor
		System.out.println("I am non argument constructor");
	}
	ThisWithConstructor(String str){
		this(); // used to call current constructor
		System.out.println("I am constructor with 1 String parameter");
	}
	ThisWithConstructor(String str, String str1){
		this(str);
		System.out.println("I am constructor with 2 String parameter");
	}
	
	public static void main(String[] args) {
		ThisWithConstructor obj = new ThisWithConstructor("Hello");
		// can we execute 2 constructor when creating an Object
		// yes - it can be achieved using this()
		//this type of constructor calls is known as CONSTRUCTOR CHAINING
		System.out.println();
		
		ThisWithConstructor obj1 = new ThisWithConstructor("Hello", "Bye");
	}

}
