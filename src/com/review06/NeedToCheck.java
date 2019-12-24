package com.review06;

public class NeedToCheck {

	public static void main(String[] args) {
		
		System.out.println("1. \"Hello World!\"");
		System.out.println("2. \t \"Hello World!\"");
		System.out.println("3. \" Hello \" \n \t \' World! \' ");
		System.out.println("4. \rHello \rWorld!");
	}}
//		import java.util.Arrays;
//		import java.util.Random;
//		public class _0441_multi_dimension_arrays_with_random_numbers {
//		    public static void main(String[] args) {
//		        Random random = new Random();
//		        int arr_sizeRow = 5;
//		        int arr_sizeCol = 10;
//		        int[][] my_arr  = new int[arr_sizeRow][arr_sizeCol];
//		        int[]   sum     = new int[arr_sizeRow];
//		        
//		        // generating random numbers
//		        int howBigNum = 50;  
//		        for (int i = 0; i < arr_sizeRow; i++) {
//		            for (int y = 0; y < arr_sizeCol; y++) {
//		                my_arr[i][y] = random.nextInt(howBigNum);
//		                sum[i] = sum[i] + my_arr[i][y];
//		            }
//		            System.out.println(Arrays.toString(my_arr[i]));
//		        }
//		        System.out.println();
//		        
//		        
//		        // arrays are sorting....
//		        for (int i = 0; i < arr_sizeRow; i++) {
//		            Arrays.sort(my_arr[i]);
//		        }
//		        System.out.println("Sorted Results...");
//		        for (int i = 0; i < arr_sizeRow; i++) {
//		            System.out.println("Row [" + i + "]   " 
//		        + Arrays.toString(my_arr[i]) 
//		        + " \tSum [" + i + "] = " + sum[i]
//		        + " \tMin [" + i + "] = " + my_arr[i][0]
//		        + " \tMax [" + i + "] = " + my_arr[i][arr_sizeCol-1]
//		                
//		                    );
//		        }
//		    }
//		}
//	}


