package com.Day_16_and_17_Algorithm_Problems;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class _01_Permutations 
{
	List<String> partial = new ArrayList<>();
	List<String> array1 = new ArrayList<>();
	
    public void swap(char[] chars, int i, int j)
    {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
 
    // Recursive function to generate all permutations of a string
    public void permutationsRecursive(char[] chars, int currentIndex)
    {
        if (currentIndex == chars.length - 1)
        {
           array1.add(String.valueOf(chars));
           System.out.println(String.valueOf(chars));
        }
 
        for (int i = currentIndex; i < chars.length; i++)
        {
            swap(chars, currentIndex, i);
            permutationsRecursive(chars, currentIndex + 1);
            swap(chars, currentIndex, i);
        }
    }
 
    public void findPermutationsRecursive(String str)
    { 
        if (str == null || str.length() == 0) 
        {
            return;
        }
        permutationsRecursive(str.toCharArray(), 0);
    }
    
    // Iterative function to generate all permutations of a string in Java using Collections
    public void findPermutationsIterative(String str)
    {
        if (str == null || str.length() == 0)
        {
            return;
        }
        
        partial.add(String.valueOf(str.charAt(0)));
        
        for (int i = 1; i < str.length(); i++)
        {
            for (int j = partial.size() - 1; j >= 0 ; j--)
            {
                String s = partial.remove(j); 
                for (int k = 0; k <= s.length(); k++)
                {
                   partial.add(s.substring(0, k) + str.charAt(i) + s.substring(k));
                }
            }
        }
 
        System.out.println(partial);
    }
    
    public void check()
    {
    	boolean status = true;
    	if (array1.size() != partial.size()) 
    	{
    		status = false;
    	} 
    	else
    	{
    		
    		Collections.sort(array1);
    		Collections.sort(partial);
    		status = array1.equals(partial);
    	}
    	if (status) 
    	{
    		System.out.println("Both the Lists Have Same Data");
    	}
    	System.out.println(array1);
    	System.out.println(partial);
    }
 
	public static void main(String[] args) 
	{
		_01_Permutations rv = new _01_Permutations();
		String str = "ABC";
        rv.findPermutationsRecursive(str);
        rv.findPermutationsIterative(str);
        rv.check();
	}

}
