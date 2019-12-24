package com.class28;

//class device, then child class "Apple"
public class Device {
	String deviceType, name;

	public Device(String deviceType, String name) {
		this.deviceType = deviceType;
		this.name = name;
	}
}
class Apple extends Device{

	public Apple(String deviceType, String name) {
		super(deviceType, name);
	}
	
}
