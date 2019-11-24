package com.class05;

public class LogicalOpBoolean {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b1 = !true;
		boolean b2 = !false;

		System.out.println(b1);
		System.out.println(b2);

		boolean traffic = true;

		if (!traffic) {
			System.out.println("On time");
		} else {
			System.out.println("Late");
		}

		boolean isRain = false;

		if (!isRain) {
			System.out.println("Take an umbrella");
		} else {
			System.out.println("Do not take an umbrella");
		}

		// let's compare 2 numbers using NOT operator

		int n1 = 10;
		int n2 = 11;

		if (n1 == n2) {
			System.out.println("Numbers are equal");
		} else {
			System.out.println("Numbers are not equal");
		}

		if (!(n1 == n2)) {
			System.out.println("Numbers are NOT equal");
		} else {
			System.out.println("Numbers are equal");
		}

		System.out.println("##############");
		System.out.println("################");

		// if name is not Marry or Anna then you are not my sister
		String name = "Marry";
//		String na2 = "Anna";
		// true OR false >>> true add NOT >>> false
		if(!(name.equals("Marry") || name.equals("Anna"))) {
			System.out.println("You are not my sister");
		} else {
			System.out.println("You are my sister");
		}

	}

}
