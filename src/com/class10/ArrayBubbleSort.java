package com.class10;

public class ArrayBubbleSort {

			public static void main(String[] args){
			//unsorted array
			int[] arr={12,34,23,2,4,56,80,34,45,90};
			//sorted array using bubble sort
			bubblesort(arr,arr.length);
			//display the content of sorted array
			int i;
			for(i=0;i<arr.length;i++) System.out.println(arr[i]);

			}

			public static void bubblesort(int[] dataset, int n){
			int i,j;
			
			for(i=0;i<n;i++)
			for(j=n-1;j>i;j--)
			if(dataset[j]<dataset[j-1])
			{
			int temp=dataset[j];
			dataset[j]=dataset[j-1];
			dataset[j-1]=temp;
			 }

			 }
}
