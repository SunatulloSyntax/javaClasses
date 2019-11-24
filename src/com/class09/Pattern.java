package com.class09;

public class Pattern {

	public static void main(String[] args) 
	{
		for (int k = 1; k <= 1; k++) 
		{
			System.out.println("*");
			for(int l = 1; l <= 5; l++) 
			{
				System.out.println("*");
			}
		}
		System.out.println("0000000000000000000000000000000");
		// **** >> rows 
//		   ****
//		   ****
//		   ****
		   for (int i = 1; i <= 4; i++) 
		   {
			   for (int j = 1; j <= 5; j++) 
			   {
				   System.out.print("*");
			   }
			   System.out.println();
		   }
		   
		   System.out.println(".............................");
		   
//		   012
//		   012
//		   012
//		   012
//		   012
		   for (int a = 0; a <= 4; a++) 
		   {
			   for (int b = 0; b <= 2; b++) 
			   {
				   System.out.print(b);
			   }
			   System.out.println();
		   }

		   System.out.println("///////////////");
		   
//		   111111
//		   222222
//		   333333
//		   444444
//		   555555
//		   666666
//		   777777
//		   
		   for (int x = 1; x <= 7; x++) 
		   {
			   for (int y = 0; y <= 5; y++) 
			   {
				   System.out.print(x);
			   }
			   System.out.println();
		   }
		   System.out.println("'''''''''''''''''''");
		   
//		   123456789
//		   123456789
//		   123456789
//		   123456789
//		   123456789
//		   
		   for (int z = 1; z <= 5; z++) 
		   {
			   for (int q = 1; q <= 9; q++) 
			   {
				   System.out.print(q);
			   }
			   System.out.println();
		   }
		   System.out.println("'''''''''''''''''");
		   
//		   54321
//		   54321
//		   54321
//		   54321
//		   54321
		   
		   for (int s = 5; s >= 1; s--) 
		   {
			   for (int d = 5; d >= 1; d--) 
			   {
				   System.out.print(d);
			   }
			   System.out.println();
		   }
		   
		   System.out.println("'''''''''''''''''''''''");
		   
//		   55555
//		   44444
//		   33333
//		   22222
//		   11111
//		   
		   for (int o = 5; o >= 1; o--) 
		   {
			   for (int p = 5; p >= 1; p--) 
			   {
				   System.out.print(o);
			   }
			   System.out.println();
		   }
		   System.out.println("''''''''''''''''''''''");
		   
//		   987654321
//		   987654321
//		   987654321
		   
		   for (int w = 1; w <= 3; w++) 
		   {
			   for (int e = 9; e >= 1; e--) 
			   {
				   System.out.print(e);
			   }
			   System.out.println();
		   }
		   System.out.println("''''''''''''''");
		   
//		   6666
//		   5555
//		   4444
//		   3333
//		   2222
//		   1111
		   
		   for (int n = 6; n >= 1; n--) 
		   {
			   for (int m = 4; m >= 1; m--) 
			   {
				   System.out.print(n);
			   }
			   System.out.println();
		   }
		   System.out.println("''''''''''''''''");
		   
//		   *
//		   **
//		   ***
//		   ****
//		   *****
		   
		   for (int k = 1; k <= 5; k++) 
		   {
			   for (int l = 1; l <= k; l++) 
			   {
				   System.out.print("*");
			   }
			   System.out.println();
		   }
		   System.out.println("'''''''''''''''''''''");
		   
		   /*1
		    *12
		    *123
		    *1234
		    *12345
		    * */
		   for (int a = 1; a <= 5; a++) 
		   {
			   for (int b = 1; b <= a; b++) 
			   {
				   System.out.print(a);
			   }
			   System.out.println();
		   }
		   System.out.println("''''''''''''''''''''");
		   
//		   1
//		   22
//		   333
//		   4444
//		   55555
//		   666666
//		   7777777
//		   88888888
//		   999999999
		   
		   for (int a = 1; a <= 9; a++) 
		   {
			   for(int b = 1; b <= a; b++) 
			   {
				   System.out.print(a);
			   }
			   System.out.println();
		   }
		   System.out.println("''''''''''''''''''''''''''");
		   
//		   **
//		   ****
//		   ******
//		   ********
//		   
		   for (int a = 1; a <= 4; a++) 
		   {
			   for(int b = 1; b <= 2*a-1; b++) 
			   {
				   System.out.print("*");
			   }
			   System.out.println();
		   }
		   System.out.println("''''''''''''''''''");
//		          *
//		         ***
//		        *****
//		       *******
//		      *********
		   
		   for (int a = 1; a <= 5; a++) 
		   {
			   for(int b = 1; b <= a; b++) 
			   {
				   System.out.print("*");
			   }
			   System.out.println();
		   }
	}

}
