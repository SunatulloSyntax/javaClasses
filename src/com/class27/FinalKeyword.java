package com.class27;

public class FinalKeyword {
	
	public final String  str = "Hello";
	
	public static void main(String[] args) {

		
		
		
		
//		String str = "I am awesome";
//		str = "I am cool";
//		System.out.println(str);
		
//		final String finalString = "Java is easy";
//		finalString = "Java is hard";  >>> ce(Compiler error)
//									   >>> cannot be modified
		
//		final int age = 120;
//		age = 100;  >>> ce
		
}
	
	public final void hello() {
		System.out.println("I am a final method in Parent class");
	}
}
	class FinalKeywordChild extends FinalKeyword{
//		final methods cannot be overriden, we will get CE
//		public final void hello() {
//			System.out.println();
//		}
		public final void hello(int a) {
			System.out.println(a);
		}
		}
	
