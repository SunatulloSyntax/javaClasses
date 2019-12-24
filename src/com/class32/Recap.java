package com.class32;

public class Recap {

	public static void main(String[] args) {

//		to store single value
		int num = 10;

//		to store multiple values inside
		int[] array = { 10, 20, 30 };

		int[] arr = new int[3];
		arr[0] = 100;
		arr[1] = 200;
		arr[2] = 300;

		System.out.println(arr[2]);

//		to retrieve all values 1 by 1
//		using enhanced loop
		for (int num1 : arr) {
			System.out.println(num1);
		}

//		using for loop
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}

//		we can store non primitive types: Objects
		Fruit f = new Apple();
		Fruit f1 = new Banana();
		Fruit f2 = new Orange();
		Object monkey = new Monkey();
//		Fruit f3 = (Fruit)monkey;

		Object[] mixArray = { f, f1, f2, monkey, "Hello" };

		for (Object element : mixArray) {
			System.out.println(element);
		}

	}
}

class Monkey extends Object {

}

class Fruit extends Object {

}

class Apple extends Fruit {

}

class Orange extends Fruit {

}

class Banana extends Fruit {

}