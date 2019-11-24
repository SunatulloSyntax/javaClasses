package com.class24Task;

public class Multilevel {

	public static void main(String[] args) {
		A c1 = new A();
		System.out.println(c1.classRefType);
		System.out.println(c1.age);
		System.out.println(c1.tailLength);
		System.out.println(c1.speed);
		c1.move();
		c1.run();
		c1.hunt();
		System.out.println("-------------------");
		
		B c2 = new B();
		System.out.println(c2.classRefType);
		System.out.println(c2.age);
		System.out.println(c2.teethLength);
		System.out.println(c2.tailLength);
		c2.move();
		c2.run();
//		c2.hunt(); >>> this gives error
		System.out.println("-----------------");
		
		C c3 = new C();
		System.out.println(c3.classReftype);
		System.out.println(c3.classReftype);
		c3.move();
//		c3.run()  >> gives error
//		c3.hunt(); >> gives error
	}

}
