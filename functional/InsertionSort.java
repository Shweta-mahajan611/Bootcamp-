package insertionsort;

import java.util.Scanner;

public class InsertionSort 
{

	public static void main(String[] args)
	{
		
		/*
		 * Scanner sc = new Scanner(System.in);
		 * System.out.println("Enter the size of array : "); int n = sc.nextInt(); //
		 * int arr[] = null; System.out.println("Enter array elements : "); for(int i=0;
		 * i<n;i++) { int arr = sc.nextInt(); }
		 */
		int i,j;
		int arr[] = {10,12,11,15,14};
		System.out.println("Array elements are : ");
		for(i=0; i<arr.length;i++)
		{
			System.out.println("  "+arr[i]);
		}
		
		for(i=0; i<arr.length; i++)
		{
			int key = arr[i];
			j=i-1;
			 while (j >= 0 && arr[j] > key)
			 { 
	                arr[j + 1] = arr[j]; 
	                j = j - 1; 
			 }
			 arr[j+1] = key;
		}
		System.out.println("Array elements after sorting :");
		for(i=0; i<arr.length; i++)
		{
			System.out.println("  "+arr[i]);
		}
	}

}
