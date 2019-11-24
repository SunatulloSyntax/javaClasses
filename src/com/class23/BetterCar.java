package com.class23;

public class BetterCar {
	
	public static String make;
	public String model;
	public String color;
	public int speed;
	public int doors;
	
	BetterCar(String carModel, String carColor, int carSpeed, int carDoors){
		model = carModel;
		color = carColor;
		speed = carSpeed;
		doors = carDoors;
	}
	
	public static void main(String[] args) {
	    make = "BMW";
	    //compiler will give an error, we have to pass values 
	    //when we build 
	    //those values will be passed arguments to the constructor
	    //through constructor instance variables will get initialized
	    BetterCar bcar1 = new BetterCar("X5", "Blue", 400, 2);
	    bcar1.getDetails();
	}
	
	public void getDetails() {
		
		System.out.println("I build " + color + " " + make + " " + model);
		System.out.println("My  car is " + doors + " doors and can have speed up to " + speed);
	}

}
