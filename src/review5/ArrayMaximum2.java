package review5;

import java.util.Scanner;

public class ArrayMaximum2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.println("Hey buddy, tell us the size of the array:");
		int size = scan.nextInt();
		
		int[] array = new int[size];
		System.out.println("The size of the array is " + size);
		
		for(int i = 0; i < array.length; i++) 
		{
			System.out.println("Enter a number");
			array[i] = scan.nextInt();
		}
		System.out.println("---------------");
		
		int max = 0;
		for(int i = 0; i < array.length; i++) 
		{
			if(array[i] > max) 
			{
				max = array[i];
			}
		}
		System.out.println("The maximum number is " + max);
	}

}
