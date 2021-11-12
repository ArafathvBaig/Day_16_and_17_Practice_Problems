package com.Day_16_and_17_Algorithm_Problems;

import java.util.Arrays;

public class _06_Anagram 
{
	static void isAnagram(String str1, String str2) 
	{
		String s1 = str1;
		String s2 = str2;
		boolean status = true;
		if (s1.length() != s2.length()) 
		{
			status = false;
		} 
		else
		{
			char[] arrayS1 = s1.toLowerCase().toCharArray();
			char[] arrayS2 = s2.toLowerCase().toCharArray();
			Arrays.sort(arrayS1);
			Arrays.sort(arrayS2);
			status = Arrays.equals(arrayS1, arrayS2);
		}
		if (status) 
		{
			System.out.println(s1 + " and " + s2 + " are anagrams");
		}
		else 
		{
			System.out.println(s1 + " and " + s2 + " are not anagrams");
		}
	}
	public static void main(String[] args)
	{
		isAnagram("Heart", "Earth");
	}
}
