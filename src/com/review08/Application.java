package com.review08;

public class Application {

	public static void main(String[] args) {
	MathOperations mathOps = new MathOperations();
    
	int sum = mathOps.add(3, 4, 5);
	System.out.println(sum);
	
	int sum2 = mathOps.add(3, 6, 7);
	System.out.println(sum2);
	
	System.out.println(mathOps.add(2, 1, 3));

	int result = mathOps.subtract(4, 2);
	System.out.println("The result is " + result);
	
	
	double d = mathOps.multiply(3, 4.5);
	System.out.println("The multiplication mult is " + d);
	
	
	double d2 = mathOps.divisible(4.8, 0);
	System.out.println("The division result is " + d2);
	
	int m = mathOps.multiply2(3.4, 2.3);
	System.out.println("The mult is " + m);

	String str = mathOps.dummy(12);
	System.out.println(str);
	
	//	mathOps.add(3, 4, 5);
//    
//    mathOps.add(3, 6, 7);
//    
//    mathOps.subtract(10, 3);
//    
//    mathOps.multiply(2.1, 3.2);
//    
//    mathOps.divisible(9.3, 0);
	}

}
