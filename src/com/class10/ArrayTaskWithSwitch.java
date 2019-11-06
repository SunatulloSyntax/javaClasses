package com.class10;

public class ArrayTaskWithSwitch {

	public static void main(String[] args) 
	{
		String[] countries = {"Tajikistan", "Uzbekistan", "Kyrgyzstan", "Turkey", "USA"};
		for(int i = 0; i < countries.length; i++) 
		{
			String capital = null;
			switch(countries[i]) 
			{
			case "Tajikistan":
				capital = "Dushanbe";
				//System.out.println("Dushanbe");
				break;
			case "Uzbekistan":
				capital = "Tashkent";
				//System.out.println("Tashkent");
				break;
			case "Kyrgyzstan":
				capital = "Bishkek";
				//System.out.println("Bishkek");
				break;
			case "Turkey":
				capital = "Ankara";
				//System.out.println("Ankara");
				break;
			case "USA":
				capital = "Washington";
				//System.out.println("Washington");
				break;
			}
			System.out.println("The capital of " + countries[i] + " is " + capital);
		}


		int m=2, total=0;

		while(m<6) {

		   total=total+m;

		   m++;

		}

		System.out.print(total);
		
		int z=2, sum=0;

		while(z<9) {

		   z++;

		   sum=sum+z;

		}

		System.out.print(sum);
		System.out.println("   ");
		int x=1;

		do{

		   x++;

		   System.out.print(x);

		}while(x<5);
		System.out.println("   ");
		int k=3, tot=0;

		do{

		   tot=tot+k;

		   k++;

		} while(k<11);

		System.out.print(tot);
		System.out.println("   ");
		
		for(int i = 0; i <= 5; i++ ) {
			   System.out.println("i = " + i );
			}

			//System.out.println("i after the loop = " + i );
			System.out.println("       ");
			
			//What is y after the following for loop statement is executed?
					int y = 0;
					for (int i = 0; i < 10; ++i) {
					y += 1;
					System.out.println(y);
					}
					System.out.println("    ");
					
					//How many times will the following code print "Welcome to Java"?
							
	}

}
