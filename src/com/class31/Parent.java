package com.class31;

public abstract class Parent {
	
	
	void hello() {
		System.out.println("Hello from super class");
	}
	
	abstract void talk();

}
class Child extends Parent{
	
	void hello() {
		System.out.println("Hello from sub class");
	}

	@Override
	void talk() {
System.out.println("Talk");		
	}
}
