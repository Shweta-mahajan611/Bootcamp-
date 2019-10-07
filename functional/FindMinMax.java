package findminmax;

public class FindMinMax
{
	static void print2Smallest(int arr[]) 
	{ 
		int secondSmallest= Integer.MAX_VALUE;
		int smallest = Integer.MAX_VALUE;
		   for (int i = 0; i < arr.length; i++)   
	        {  
			   if (arr[i] < smallest) 
	           		 { 
				    secondSmallest = smallest; 
	                	    smallest = arr[i]; 
	               
	            		} 
			   else if (arr[i] < secondSmallest && arr[i]!=smallest)
			   	{
	                	    secondSmallest = arr[i]; 
			   	}
	        }  
		   System.out.println("\nSecond smallest number is:" + secondSmallest);
	} 	
	static void print2Largest(int arr[]) 
	{ 
	int secondLargest = Integer.MIN_VALUE;
	int largest = Integer.MIN_VALUE;
	for (int i = 0; i < arr.length; i++) 
	{
		if (arr[i] > largest) 
		{
			secondLargest = largest;
			largest = arr[i];

		}
		else if (arr[i] > secondLargest) 
		{
			secondLargest = arr[i];

		}
	}

	System.out.println("\n Second largest number is:" + secondLargest);

}
	public static void main(String[] args) 
	{
		int arr[] = { 14, 70, 86, 86, 92, 52 };
		System.out.println("The given array is:" );
		for (int i = 0; i < arr.length; i++) 
		{
			System.out.print(arr[i]+"\t");
		}
		print2Smallest(arr);
		print2Largest(arr);
	}

}
