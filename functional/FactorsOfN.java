package factorsofN;

import java.util.Scanner;

public class FactorsOfN 
{
	public static void main(String[] args) 
	{
		
		System.out.println("Enter any no : ");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		System.out.println("Factors of "+n +" are" );
		for(int i=2; i*i<n; i++)
		{
			while(n%i == 0)
			{
				n= n/i;
				System.out.println(i);
			}
		}
		if(n>2)
		{
			System.out.println(n);
		}
		
	}

}
