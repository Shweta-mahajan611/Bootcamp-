package palindromstring;

import java.util.Scanner;

public class PermutationString 
{
	
	static int fact=1;
	static void factorial(int len)
	{
		for(int i=1;i<=len;i++)
		{
			fact=fact*i;
		}
	}
	
	static int count=1;
	static void permutations(char a[])
	{
		for(int i=0;i<a.length-1;i++)
		{
			int j=i+1;
			char temp=a[i];
			a[i]=a[j];
			a[j]=temp;
			for(int k=0;k<a.length;k++)
			{
				System.out.print(a[k]);
			}
			System.out.println();
			count++;
			if(fact==count)
				return;
		}
		if(fact!=count)
		{
			permutations(a);
		}
		else
		{
			return;
		}
	}
	public static void main(String[] args)
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.print("Enter String to generate permutations : "); 
		 String str=sc.nextLine();

		 char arr[] = str.toCharArray();
		 int no=arr.length;
		 PermutationString.factorial(no);
		 
		 for(int k=0; k<no; k++)
		 {
			 System.out.println(arr[k]);
		 }
		 System.out.println();
		 PermutationString.permutations(arr);
		
	}
			
}


