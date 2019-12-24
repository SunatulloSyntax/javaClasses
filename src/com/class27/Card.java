package com.class27;

public class Card {
	/*define a class card
	 * subclasses in which
	 * it is own behavior*/
	public void chargeInterest() {
		System.out.println("Card charges 25% interest");
	}
	public void creditLimit() {
		System.out.println("Credit limit of the card is 5000");
	}
}
class AX extends Card{
	
	@Override
	public void creditLimit() {
		System.out.println("Credit limit of the AX card is 25000");
	}
}
class MC extends Card{
	
	@Override
	public void creditLimit() {
		System.out.println("Credit limit of the Mx card is 15000");
}
	public void cashBack() {
		System.out.println("Mc gives cash back of 3%");
	}
}
class Visa extends Card{
	
	@Override
	public void creditLimit() {
		System.out.println("Credit limit of the Visa card is 20000");
}
	}

class Discovery extends Card{
	
	
	public void applePay() {
		System.out.println("Discovery can take apple pay");
}
}