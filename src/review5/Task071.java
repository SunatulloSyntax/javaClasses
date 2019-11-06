package review5;

public class Task071 {

	public static void main(String[] args) {
		for(int a = 1; a <= 5; a++) 
		{
			for(int b = 1; b <= 10; b++) 
			{
				System.out.print((a*b) + " ");
			}
			System.out.println();
		}
		
		System.out.println("''''''''''''''''''''''");
		for(int a = 1; a <= 5; a++) 
		{
			for(int b = 1; b <= 10; b++) 
			{
				if(a == 1) {
				System.out.print(b + " ");
				}
				if(a == 2) 
				{
					System.out.print(b*2 + " ");
				}
				if(a == 3) 
				{
					System.out.print(b*3 + " ");
				}
				if(a == 4) 
				{
					System.out.print(b*4 + " ");
				}
				if(a == 5) 
				{
					System.out.print(b*5 + " ");
				}
			}
			System.out.println();
//			for() 
//			{
//				
//			}
//			for() 
//			{
//				
//			}
			
		}
	}

}
