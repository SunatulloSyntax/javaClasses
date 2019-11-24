package com.class19;

public class MehodWithReturnValue {

	public static void main(String[] args) {
	/*declare a String and if String has more that 10 characters >>> String is big
	 *otherwise >>> String is small 
	 * */	
		
		String str = "Welcome home";
		int numOfChars = str.length();
		
		if(numOfChars > 10) {
			System.out.println("String is big");
		}else {
			System.out.println("Sting is small");
		}
		
		char character = str.charAt(4);
		System.out.println(character);
		
		//create an object of the class where method is defined
		RClass obj = new RClass();
//		int num = obj.sum(10,30); >>> compile error saying change return type
		obj.sum(10,20);
		
		ClassMethodWithReturn obj1 = new ClassMethodWithReturn();
		int sum = obj1.sum(50, 50);
		System.out.println(sum);
		
		int largest = obj1.findLargest(3, 2);
		System.out.println("Largest numberis " + largest);
	}

}
