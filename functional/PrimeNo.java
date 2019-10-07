package primeno;

import java.util.Scanner;

public class PrimeNo 
{

	public static void main(String[] args) 
	{
		 Scanner sc= new Scanner(System.in);
		  System.out.println("Enter range of no to print prime nos "); 
		  int start = sc.nextInt();
		  int end = sc.nextInt();
		  
		  int i =0;
	       int num =0;
	       //Empty String
	       String  primeNumbers = "";

	       for (i = start; i <= end; i++)         
	       { 		  	  
	          int counter=0; 	  
	          for(num =i; num>=start; num--)
	          {
	             if(i%num==0)
	             {
	            	 counter = counter + 1;
	             }
	          }
	          if(counter ==2)
	          {
	        	  //Appended the Prime number to the String
	        	  primeNumbers = primeNumbers + i + " ";
	          }	
	       }	
	       System.out.println("Prime numbers from "+start +" to " +end +" are :");
	       System.out.println(primeNumbers);
	}

}
