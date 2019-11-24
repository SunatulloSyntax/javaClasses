package com.class24;

public class Car {
	 
	 String brand;
	 int year;
	 
	 
	 private Car() {
		 System.out.println("Private class");
	 }
	 
	 protected Car(String str) {
		 System.out.println("This is protected " + str);
	 }
	 
	 
	 
	 public Car(int str, int a){   // can not write static in constructor
		 System.out.println("This is  2nd" + str);
	 }
	 
	 public Car(int a) {
		 System.out.println("This is public");
	 }
	 
	 public static void main(String[] args) {
		 Car car = new Car();
		 Car car1 = new Car("constructor");
		 
	 }
}
