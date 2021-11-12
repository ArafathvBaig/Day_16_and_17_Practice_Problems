package com.Day_16_and_17_Algorithm_Problems;

public class _04_Bubble_Sort 
{
	static void bubbleSort(int[] arr) 
	{
		int n = arr.length;
		int temp = 0;
		for (int i = 1; i <= n; i++) 
		{
			for (int j = 0; j < (n - i); j++) 
			{
				if (arr[j] > arr[j+1]) 
				{
					// swap elements
					temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = temp;
				}
			}
		}
	}

	public static void main(String[] args) 
	{
		int arr[] = { 99, 89, 79, 69, 59, 49, 39, 29, 19, 9 };

		System.out.println("Array Before Bubble Sort");
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i] + " ");
		}
		System.out.println();

		bubbleSort(arr);// sorting array elements using bubble sort

		System.out.println("Array After Bubble Sort");
		for (int i = 0; i < arr.length; i++)
		{
			System.out.print(arr[i] + " ");
		}
	}
}

	

	