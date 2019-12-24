package com.class28;

public class CarTest {
	public static void main(String[] args) {
//		Tesla tesla = new Tesla("Tesla", "S4", true);
//		Tesla tesla1 = new Tesla();
//		tesla1.displayInfo();
		System.out.println("-----Creating another object-----");
		Tesla tesla2 = new Tesla("Tesla","S4",false);
		tesla2.displayInfo();
	}
	
	public void helloName(String name){
		System.out.println("Hello " + name);
	} 
}
