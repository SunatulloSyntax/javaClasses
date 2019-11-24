package com.class17;

public class Dog {
	//define attributes/ features
	String color, name;
	int age;
	boolean tail;
	double height;
    
	
	//method 
	void run() {
		System.out.println("My dog " + name + color + " color " + age + " years old and " + " can run fast.");
		
	}
	void aggresive() {
		System.out.println(name + " is not aggresieve.");		
	}
	void play() {
		System.out.println(name + " can play with you.");
	}
	
	
	public static void main(String[] args) {
		Dog Husky = new Dog();
		Husky.color = "black and white";
		Husky.name = "puppy";
		Husky.age = 2;
		Husky.height = 1.5;
		Husky.tail = true;
		
		//calling methods from class 'Dog'
		Husky.run();
		Husky.aggresive();
		Husky.play();
				
				
		Dog Bulldog = new Dog();
		Bulldog.color = "grey";
		Bulldog.name = "bull";
		Bulldog.age = 1;
		Bulldog.height = 1.2;
		Bulldog.tail = false;
		
		Bulldog.run();
		Bulldog.aggresive();
		Bulldog.play();
		
		Dog Labrador = new Dog();
		Labrador.color = "black";
		Labrador.name = "Pulo";
		Labrador.age = 2;
		Labrador.height = 2.5;
		Labrador.tail = true;
		
		Labrador.run();
		Labrador.aggresive();
		Labrador.play();
		
		
		
		
	}

}
