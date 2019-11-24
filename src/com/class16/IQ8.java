package com.class16;

public class IQ8 {

	public static void main(String[] args) {
//		 Write a Java Program to print first 10 numbers of Fibonacci series. 
//		 fibonacci number = 0, 1, 1, 2, 3,5,    8,    13, 21...
//		                    0+1 = 1,  2+3=5,5+3=8,8+5=13...
		/*                  a+b = c,
		 * 			 
		 * */
		
		int a, b, c;
		a = 0;
		b = 1;
		
		for(int i = 0; i < 10; i++) {
			System.out.print(a + " ");
			c = a + b;
			a = b; 
			b = c;
		}
		System.out.println();
		
		int[] f = new int[10];
        
        for(int i = 0; i<f.length;i++) {
            if(i==0 || i==1) {
                f[i] = i;
            }
            else {
            
                f[i] = f[i-1] + f[i-2];
            }
            System.out.print(f[i] + " ");
        }
	}

}
