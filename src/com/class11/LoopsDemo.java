package com.class11;

public class LoopsDemo {

	public static void main(String[] args) 
	{
		String[] cars = {"Toyota", "Dodge", "infinity", "camry", "avenger", "corolla"};
		
		for(String element : cars) 
		{
			System.out.println(element);
		}
		System.out.println();
		
		for(int i = 0; i < cars.length; i++) 
		{
			System.out.println(cars[i]);
		}
		System.out.println("'''''''''''''''''''");
		
		int[] arr = {1,2,3,4,5,6};
		int sum = 0;
		for(int value : arr) 
		{
			sum += value;
			
			
		}
		System.out.println(sum);
		System.out.println("''''''''''''''''''''");
		
		String[] countries = {"Tajikistan", "Turkey", "Usa", "Kyrgyzstan"};
		String[] capitals = {"D", "A", "W", "X"};
		for(int i = 0; i < countries.length; i++) 
		{
			System.out.println(countries[i] + " " + capitals[i]);
			
			
			
		}
		System.out.println();
	}

}
