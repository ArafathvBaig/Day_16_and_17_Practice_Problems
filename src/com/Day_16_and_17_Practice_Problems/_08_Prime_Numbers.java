package com.Day_16_and_17_Practice_Problems;

public class _08_Prime_Numbers 
{	
	public void primeNumbers(int n, int n1)
	{
		int array1[] = new int[168];
		int k=0;
		for(int i = n; i <= n1; i++)
		{
			int flag=0;
			if((i<=0) || (i==1))
			{
				System.out.println(+i+" is not a Prime Number");
			}
			else if(i==2)
			{
				System.out.println(+i+" is a Even Prime Number.");
			}
			else
			{
				for(int j=1; j<=i; j++)
				{
					if((i%j)==0)
					{
						flag=flag+1;
					}
				}
				if(flag==2)
				{
					array1[k]=i;
					k++;
				}
			}
		}
		System.out.println("Prime Numbers: ");
		for(int i=0; i<167; i++)
		{
			System.out.println(array1[i]);
		}
		
		System.out.println("Prime Numbers 2D Array: ");
		int array2d[][] = new int[10][100];
		k=0;
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<100; j++)
			{
				if(array1[k] <= ((i+1)*100) && k<=166)				
				{
					array2d[i][j] = array1[k];
					k++;
				}
				else
				{
					j=j+100;
				}
			}
		}
		for(int i=0; i<10; i++)
		{
			for(int j=0; j<100; j++)
			{
				if(array2d[i][j] == 0)
				{
					j=100;
				}				
				else
				{
					System.out.print(array2d[i][j]+" ");
				}
			}
			System.out.println(" ");
		}
		
	}
	
	public static void main(String[] args) 
	{
		_08_Prime_Numbers pn = new _08_Prime_Numbers();
		pn.primeNumbers(0, 1000);
	}
}