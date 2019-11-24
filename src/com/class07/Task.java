package com.class07;

public class Task {
	public static void main(String[] args) 
	{
	/*	boolean workDay = true;
		int day = 2;
		
		while(workDay) 
		{
			System.out.println("I need a day off");
		    
			if (day == 6) 
			{
				System.out.println("I do not need a day of anymore");
				workDay = false;
			}
			day++;
		} 
	System.out.println("            ");
	*/
	boolean w = true;
    int d = -1;
    
        while (w) 
        {
        if(d == 6) 
        {
        	w = false;
        	System.out.println("I do not need a day off");
        }else 
        {
        	System.out.println("I need off day");
        }
        d++;
        }
	}

}
