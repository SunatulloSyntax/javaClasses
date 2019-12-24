package com.review10;

public class ENT extends Doctor {
	//Child Class does not inherit Parent Class constructor
	//Child Class calls/executes/uses one of the Parent Class constructors
	
	//This is already there
	//public ENT(){
//	super();
//	}
	
	public ENT(String name, String specialty, int licencId) {
		super(name, specialty, licencId);
	}
	
	public void chargePatient() {
		System.out.println("Gets $1000");
	}
}
