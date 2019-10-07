package leapyear1;

import java.util.Scanner;

public class LaepYear 
{

	public static void main(String[] args)
	{
		int year;
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter year");
        year=sc.nextInt();
        if(year>=1582) 
        {
        	if((year % 4 == 0)&& (year %400 ==0)&& (year %100 ==0))
        	{
        		System.out.println(year + " is a leap year.");
        	}
        	else
        	{
                 System.out.println(year + " is not a leap year.");
        	}
	    }
        else
        {
        	System.out.println("Enter valid year!!");
        }
	}
}
