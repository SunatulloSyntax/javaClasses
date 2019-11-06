package exercises;

public class TwoDArrays {

	public static void main(String[] args) 
	{
		
		int[][] arr = 
			{
					{2,4,6,3,2},
					{1,5,3,5,6,},
					{1,4,1,2,4}
			};
		
		for(int i = 0; i < 3; i++) 
		{
			for(int j = 0; j < 5; j++) 
			{
				System.out.print(arr[i][j] + " ");
			}
			System.out.println("");
		}
	System.out.println("--------");
	
	int[] ar = {1,2,3,4,5,6};
	
	for(int element: ar) 
	{
		System.out.print(element + " ");
	}
	
	}

}
