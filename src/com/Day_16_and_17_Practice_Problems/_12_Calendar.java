package com.Day_16_and_17_Practice_Problems;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class _12_Calendar 
{
	public static void printCalendar(int year, int month) 
	{
		int dayOfWeek = 1;
		String space = "   ";
		String monthName[] = { "January", "February", "March", "April", "May", "June", 
				               "July", "August", "September", "October", "November", "December" };
		int[] calDays = { 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		// object to get month
		Calendar cal = new GregorianCalendar(year, month, 1);
		// Following calculates if the current year is leap year
		if (year % 100 == 0) 
		{
			if (year % 400 == 0) 
			{
				calDays[1] = 29;
			}
		}
		else if (year % 4 == 0) 
		{
			calDays[1] = 29;
		}
		
		System.out.println("Year: " + year + space + "Month: " + monthName[month] + "\n");
		System.out.println("S   M   T   W   T   F   S\n");
		// Following loop will find out where to print the first day of the month
		// dayCounter represents current day of the month and dayOfWeek represents the
		// day of the
		// week where 1 is Sunday
		for (int dayCounter = 1; dayCounter <= calDays[month]; dayCounter++) 
		{
			if (dayCounter > 9) 
			{
				space = "  ";
			}
			// This if will find out print out spaces until the day the first of the
			// month falls on
			if (dayCounter == 1) 
			{
				while (dayOfWeek != cal.get(Calendar.DAY_OF_WEEK)) 
				{
					System.out.print(space + " ");
					dayOfWeek++;
				}
				// Now we have found the right place to print the first day of the month
				System.out.print(dayCounter + space);
				dayOfWeek++;
			}
			else 
			{
				// This checks to see if we are at the end of the row.
				if (dayOfWeek == 8) 
				{
					// Print a newline and start on the next row and set the day to 2
					// since we just printed the first position
					System.out.print("\n" + dayCounter + space);
					dayOfWeek = 2;
				} 
				else 
				{
					// this prints out the current day number and increments j
					System.out.print(dayCounter + space);
					dayOfWeek++;
				}
			}
		}
		System.out.println("\n");
	}
	
	public static void main(String[] args) 
	{
		printCalendar(2021, 10);
		printCalendar(2020, 1);
	}
}
