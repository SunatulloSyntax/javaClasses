package com.class29;

public class Parent {
	String str = "Hello";
	int age;
	
	public Parent(int age) {
		this.age = age;
	}
	public void hello() {
		System.out.println("CONSTRUCTOR Hello");
	}
	
	
	public static void main(String[] args) {
	  Child cc = new Child(3);	
	  cc.display();
	}
}


class Child extends Parent{
	
	Child(int age){
		super(age);
	}
	String str1 = "Bye";
	
	public void access() {
		System.out.println(str);
		System.out.println(super.str);
	}
	public void hello() {
		System.out.println("CHILD Hello");
	}
	public void display() {
		hello();
		super.hello();
	}
}
