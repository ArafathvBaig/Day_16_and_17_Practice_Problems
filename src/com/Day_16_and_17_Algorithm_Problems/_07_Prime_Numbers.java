package com.Day_16_and_17_Algorithm_Problems;

public class _07_Prime_Numbers 
{
	public void primeNumbers(int n, int n1)
	{
		for(int i = n; i <= n1; i++)
		{
			int flag=0;
			if((i<=0) || (i==1))
			{
				System.out.println(+i+" is not a Prime Number.");
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
					System.out.println(i);
				}
			}
		}
	}
	public static void main(String[] args) 
	{
		_07_Prime_Numbers pn = new _07_Prime_Numbers();
		pn.primeNumbers(0, 1000);
	}
}