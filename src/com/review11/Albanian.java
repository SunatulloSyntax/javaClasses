package com.review11;

public class Albanian extends Human {
	String albanianId;

	public Albanian() {

	}

	public Albanian(String name, int age, int weight, String albanianId) {
		super(name, age, weight);
		this.albanianId = albanianId;
	}

	@Override
	public String greeting() {
		return "Pershendentje";
	}

	@Override
	public void talk() {
		System.out.println("Una flas shqip. Une quhen " + name);
	}
	
	public void albanianDance() {
		System.out.println("Albanian dance");
	}
}
