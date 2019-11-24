package com.class17;

public class ObjectForComputerClass {

	public static void main(String[] args) {
		Computer laptop = new Computer();
		laptop.keyboard = true;
		laptop.monitor = "big";
		laptop.name = "DEll";
		laptop.brand = "XPS 15";
		laptop.mouse = true;
		laptop.memory = 500;
		laptop.ram = 16;
		System.out.println("My laptop's features are " + laptop.name + ", " + laptop.brand +
				". Memory is " + laptop.memory + " RAM is " + laptop.ram);
		
	}

}
