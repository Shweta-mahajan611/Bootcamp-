package bubblesort;

import java.util.Scanner;

import java.util.Scanner;

public class BubbleSort 
{
    public static void main(String[] args)
	{
		 int n,i,j, swap;
		    Scanner in = new Scanner(System.in);
		 
		    System.out.println("Enter the size of array :");
		    n = in.nextInt();
		 
		    int arr[] = new int[n];
		 
		    System.out.println("Enter " + n + " integers");
		 
		    for (i = 0; i < n; i++)
		    {
		      arr[i] = in.nextInt();
		    }
		    
		    for (i = 0; i < ( n - 1 ); i++)
		    {
		      for (j = 0; j< n - i - 1; j++)
		      {
		        if (arr[j] > arr[j+1]) /* For descending order use < */
		        {
		          swap       = arr[j];
		          arr[j]   = arr[j+1];
		          arr[j+1] = swap;
		        }
		      }
		    }
		    System.out.println("Sorted list of numbers:");
		    
		    for (i = 0; i < n; i++)
		      System.out.println(arr[i]);
	}
 }

