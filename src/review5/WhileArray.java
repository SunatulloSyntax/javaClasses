package review5;

import java.util.Scanner;

public class WhileArray {

	public static void main(String[] args) {
		// the size of the array is fixed
		String[] strArray = new String[10];
		
		Scanner sc = new Scanner(System.in);
		
		
		int index = 0;
		String name = null;
		do 
		{
			System.out.println("Enter names, to stop enter 'STOP'");
			name = sc.nextLine();
			strArray[index] = name;
			index++;
		}
		while(!name.equalsIgnoreCase("STOP"));
	}

}
