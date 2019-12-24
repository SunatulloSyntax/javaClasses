package com.class30;

public interface Bank {

	void haveChecking();

	void haveSavings();
}

interface Trustable {
	void trust();
}

class Finance {
	public void financing() {
		System.out.println("Financial transaction must happem");
	}
}

class BOA extends Finance implements Bank, Trustable {

	@Override
	public void haveChecking() {
		System.out.println("BOA has a checking account");
	}

	@Override
	public void haveSavings() {
		System.out.println("BOA has a saving account");
	}

	@Override
	public void trust() {
		System.out.println("You can trust BOA with your money");
	}
}

class CapitalOne extends Finance implements Bank, Trustable {

	@Override
	public void haveChecking() {
		System.out.println("Capital One has a saving account");

	}

	@Override
	public void haveSavings() {
		System.out.println("Capital One has a saving account");

	}

	@Override
	public void trust() {
		System.out.println("You can trust Capital One with your money");
	}
}
class CapitalOneChild extends CapitalOne{
	
}