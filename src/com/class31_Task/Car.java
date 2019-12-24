package com.class31_Task;

//Create a Class Car that would have the following fields: 
//	carPrice and color and method calculateSalePrice()
//	which should be returning a price of the car.
//Create 2 sub classes: Sedan and Truck. The Truck class
//has field as weight and has its own implementation of 
//calculateSalePrice() method in which returned price 
//calculated as following: if weight>2000 then returned
//price car should include 10% discount, otherwise 20% discount.
//The Sedan class has field as length and also does it 
//is own implementation of calculateSalePrice(): 
//	if length of sedan is >20 feet then returned 
//	car price should include 5% discount, otherwise 10% discount
public class Car {

	double carPrice;
	String color;

	public Car(double carPrice, String color) {
		this.carPrice = carPrice;
		this.color = color;
	}

	public double calculateSalePrice() {
		return carPrice;
	}

	public void display() {
		System.out.println("Sale Price of " + color + " vehicle is $" + carPrice);
	}
	
	public static void main(String[] args) {
		
		System.out.println("--------Car--------");
		Car car = new Car(2000, "blue");
		System.out.println(car.calculateSalePrice());
		
		System.out.println("---------Sedan---------");
		Sedan sedan = new Sedan(2000, "pink", 30);
		System.out.println(sedan.calculateSalePrice());
		
		System.out.println("----------Truck----------");
		Truck truck = new Truck(2000, "grey", 3000);
		System.out.println(truck.calculateSalePrice());
	}
	
	
}

class Sedan extends Car {

	int length;

	public Sedan(double carPrice, String color, int length) {
		super(carPrice, color);
		this.length = length;
	}

	public double calculateSalePrice() {
		if (length > 20) {
			carPrice = carPrice - (carPrice * 0.05);
		} else {
			carPrice = carPrice - (carPrice * 0.01);
		}
		return carPrice;
	}
}

class Truck extends Car {
	
	double weight;

	public Truck(double carPrice, String color, double weight) {
		super(carPrice, color);
		this.weight = weight;
	}
	
	public double calculateSalePrice() {
		double truckPrice;
		if(weight > 200) {
			truckPrice = carPrice * 0.09;
		}else {
			truckPrice = carPrice * 0.08;
		}
		return truckPrice;
	}

}
