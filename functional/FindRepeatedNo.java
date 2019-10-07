package findrepeatedno;

import java.util.Scanner;

public class FindRepeatedNo 
{
	 void findRepeat(int arr[])  
	    { 
	        int i, j; 
	        System.out.println("\n Repeated Elements are :"); 
	        for (i = 0; i < arr.length; i++)  
	        { 
	            for (j = i + 1; j < arr.length; j++)  
	            { 
	                if (arr[i] == arr[j])  
	                    System.out.println(arr[i] + " "); 
	            } 
	        } 
	    } 


	public static void main(String[] args) 
	{
		FindRepeatedNo no = new FindRepeatedNo();
		int arr[] = new int[10];
		int i=0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array elements : ");
		for(i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		System.out.println("Array elements are : ");
		for (i = 0 ; i<arr.length; i++) 
		{
			System.out.print(arr[i]+" ");
		}
		no.findRepeat(arr);
	}

	}
