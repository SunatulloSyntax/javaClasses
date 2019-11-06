package com.class10;

public class ArrayTask1 {

	public static void main(String[] args) 
	{
		String[] countries = {"Tajikistan", "Uzbekistan", "KyrgYzstan", "Turkey", "USA"};
		
		for(int i = 0; i < countries.length; i++) 
		{
			if(countries[i].equalsIgnoreCase("usa")) 
			{
				System.out.println("The capital of " + countries[i] + " is Washington");
			}else if(countries[i].equalsIgnoreCase("Uzbekistan")) 
			{
				System.out.println("The capital of " + countries[i] + " is Tashkent");
			}
		    else if(countries[i].equalsIgnoreCase("tajikistan")) 
		    {
			System.out.println("The capital of " + countries[i] + " is Dushanbe");
		    }
		    else if(countries[i].equalsIgnoreCase("turkey")) 
		    {
		    	System.out.println("The capital of " + countries[i] + " is Istanbul");
		    }
		    else 
		    {
		    	System.out.println("The capital of " + countries[i] + " is Bishkek");
		    }
		    
		}
		
		
		
	}

}
