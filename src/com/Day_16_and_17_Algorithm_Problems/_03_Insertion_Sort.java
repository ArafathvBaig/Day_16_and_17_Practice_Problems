package com.Day_16_and_17_Algorithm_Problems;

public class _03_Insertion_Sort
{
	public static String[] sort_sub(String array[], int f)
	{
		String temp="";
		for(int i=0;i<f;i++)
		{
			for(int j=i+1;j<f;j++)
			{
				if(array[i].compareToIgnoreCase(array[j])>0)
				{
					temp = array[i];
					array[i]=array[j];
					array[j]=temp;
				}
			}
		}
		return array;
	}
	public static void main(String[] args) 
	{
		String[] arr ={"Arafath", "Afriha", "Shafifa", "Karimulla", "Rehana", "Ajeemun", "Ismail"};
		String sortedArray[] = sort_sub(arr, arr.length); 
		for(int i=0;i<sortedArray.length;i++)
		{
			System.out.println(sortedArray[i]);
		}
	}		
}