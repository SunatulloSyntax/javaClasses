package com.class20;

public class MySonMath {
	protected String name;
	          String phone;
	private String SSN;
	protected String birthday;
	
	//public can be seen/accessed
	//from everywhere
	public void add1() {      
		int num1 = 2; // this void is called local variable >>> RETURN is void || no RETURN
		int num2 = 1;
		int result = num1 + num2;
		
	}
	
	//default can be seen/accessed
	//within package
	 void add2(int num1, int num2) {
		int result = num1 + num2;
	}
	
	 //protected can be seen/accessed
	 //within package
	protected int add3() {
		int num1 = 2;
		int num2 = 2;
		int result = num1 + num2;
		return result;
	}
	
	//protected can be seen/accessed
   //within package
		protected int add4(int num1, int num2) {
			int result = num1 + num2;
			return result;
		}
	
	//private can be seen/accessed
	//only within the class
	private int add5(int num1, int num2) {
		int result = num1 + num2;
		return result;
		
	}
	

}
