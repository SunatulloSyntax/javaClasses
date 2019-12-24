package com.review10;

public class Doctor {
	public String name;
	public String specialty;
	public int licenceId;
	public String address;
	public String dayOff;
	
	public Doctor() {
		
	}
	
	
	public Doctor(String name, String specialty, int licencId) {
		this.name = name;
		this.specialty = specialty;
		this.licenceId = licenceId;
	}
	
	public Doctor(String name, String specialty, int licenceId, String addredss, String dayOff) {
		this(name, specialty, licenceId);
		this.address = address;
		this.dayOff = dayOff;
		this.chargePatient();
	}
	
	public void chekUp(String name) {
		System.out.println("Doctor " + this.name + " has ordered blood test for " + name);
	}
	
	public void treatPatien() {
		System.out.println("Gives a decription");
	}
	
	public void chargePatient() {
		System.out.println("Gets $100");
	}
	
	public void displayInfo() {
		System.out.println("Doctor " + this.name + " with license id: " + licenceId + " is a " + specialty);
	}
}
