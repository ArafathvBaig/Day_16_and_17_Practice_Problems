package com.Day_16_and_17_Algorithm_Problems;

import java.util.Arrays;

public class _08_Prime_Anagram_Palindrome 
{
	int array1[] = new int[167];
	int k=0;
	public void primeNumbers(int n, int n1)
	{
		for(int i = n; i <= n1; i++)
		{
			int flag=0;
			if((i<=0) || (i==1))
			{
				System.out.println(+i+" is not a prime number");
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
	}
	
	public void isAnagram() 
	{
		int l1=0;
		int l2=0;
		int temp=0;
		for(int i=0; i<167; i++)
		{
			int n = array1[i];
			if(n>0 && n<10)
			{
				l1=1;				
			}
			if(n>10 && n<100)
			{
				l1=2;
			}
			if(n>100 && n<1000)
			{
				l1=3;
			}
			int a1[] = new int[l1];
			temp=n;
			for(int m=0; m<l1; m++)
			{
				if(temp>0)
				{
					a1[m]=temp%10;
					temp = temp/10;
				}
			}
			
			for(int j=i+1; j<167; j++)
			{	
				int n1 = array1[j];
				if(n1<10)
				{
					l2=1;
				}
				if(n1>10 && n1<100)
				{
					l2=2;
				}
				if(n1>100 && n1<1000)
				{
					l2=3;
				}
				int a2[] = new int[l2];
				temp=n1;
				for(int m=0; m<l2; m++)
				{
					if(temp>0)
					{
						a2[m]=temp%10;
						temp = temp/10;
					}
				}
				boolean status = true;
				if (a1.length != a2.length) 
				{
					status = false;
				} 
				else
				{
					
					Arrays.sort(a1);
					Arrays.sort(a2);
					status = Arrays.equals(a1, a2);
				}
				if (status) 
				{
					System.out.println(n + " and " + n1 + " are anagrams");
				}
			}
		}
	}
	
	public void palindrome()
	{
		for(int i=0; i<167; i++)
		{
			int n=array1[i];
			int r;
			int sum=0;
			int temp;
			temp=n;
			while(n>0)
			{
				r=n%10;
				sum=(sum*10)+r;
				n=n/10;
			}
			if(temp==sum)
			{
				System.out.println("The given number "+temp+" is Palindrome");
			}
		}	
	}
	
	public static void main(String[] args) 
	{
		_08_Prime_Anagram_Palindrome  pn = new _08_Prime_Anagram_Palindrome ();
		pn.primeNumbers(0, 1000);
		pn.isAnagram();
		pn.palindrome();
	}
}
