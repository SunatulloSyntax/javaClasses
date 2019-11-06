package review4;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
	    int n;
		do 
		{
			System.out.println("Please pay for candy");
			 n = scan.nextInt();
		   
		}
	
		while (n != 3);
		System.out.println("Enjoy your candy");
	}

}
