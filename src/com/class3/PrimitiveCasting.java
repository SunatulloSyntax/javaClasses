package com.class3;

public class PrimitiveCasting {
	public static void main(String[] args) {
		double a = 12;
		System.out.println(a);
		
		
		byte b = 127;
		int i = b;
		
		int num = 123;
		double a1 = num;
		System.out.println(a1);
		
		double d2 = 123.56;
		int num2 = (int)d2;
		System.out.println(num2);
		
		int num3 = 789;
		byte b1 = (byte)num3; 
		System.out.println(b1);
	}

}
