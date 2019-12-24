package com.class28;

public class Child extends Parent {
	
	String name = "James";
	
	public static void main(String[] args) {
		Child obj = new Child();
		obj.callingMethod();
		
	}
	
	public void callName() {
		System.out.println(name);
		System.out.println(super.name);
		System.out.println(lastName);
		
	}
	
	public void callingMethod() {
		callName(); //By default 'this.' is added - so we are calling current class method
		super.callName();
	}
}
