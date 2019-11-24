package com.ExercisesFromCodeDope;

public class Programming {
/*Create a class named 'Programming'.
 *  While creating an object of the class,
 *   if nothing is passed to it, 
 *   then the message "I love programming languages" should be printed.
 *   If some String is passed to it, then in place of 
 *   "programming languages" the name of that String variable should 
 *   be printed.
  For example, while creating object if we pass "Java", 
  then "I love Java" should be printed.
*/

	
	Programming(){
		
		System.out.println("I love programming languages");
	}
	
	Programming(String s){
	
		System.out.println("I love "  + s);
	}
	
	public static void main(String[] args) {
		Programming a = new Programming();
		Programming b = new Programming("java");
		
	}
}
