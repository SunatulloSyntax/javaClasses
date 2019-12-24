package com.class29;

public class VehicleTest {

	public static void main(String[] args) {
		
		Car car = new BMW();
		car.drive();
		car.start();
		car.start();
		car.speed();
		car.breaking();
		
		System.out.println("===");
		
		Vehicle vehicle = new BMW();
		vehicle.drive();
		vehicle.start();
		vehicle.stop();
		vehicle.speed();
	}
}
