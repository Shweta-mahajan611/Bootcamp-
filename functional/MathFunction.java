package mathfunction;

import java.util.Scanner;

public class MathFunction 
{
	private static final String[] args = null;
	//harmonic no
	static double nthHarmonic(int n)
	{
		float harmonic=1;
		for(int i=2;i<=n;i++)
		{
			harmonic += (float)1/i;
		}
		return harmonic;
	}
	
	//sin of an angle
	static void sinofangle(String d)
	{

		double x = Double.parseDouble(d);

	        //convert x to an angle between -2 PI and 2 PI
	        x = x % (2 * Math.PI);

	        // compute the Taylor series approximation
	        double term = 1.0;      // ith term = x^i / i!
	        double sum  = 0.0;      // sum of first i terms in taylor series

	        for (int i = 1; term != 0.0; i++) {
	            term *= (x / i);
	            if (i % 4 == 1) sum += term;
	            if (i % 4 == 3) sum -= term;
	        }
	        System.out.println(sum);
	}
	//decimal to binary conversion
	static void decToBinary(int no) 
    { 
        // array to store binary number 
        int[] binaryNum = new int[1000]; 
   
        // counter for binary array 
        int i = 0; 
        int j=0;
        while (no > 0)  
        { 
            // storing remainder in binary array 
            binaryNum[i] = no % 2; 
            no = no / 2; 
            i++; 
        } 
        
        
        // printing binary array in reverse order 
       
        for (j = i - 1; j >= 0; j--) 
            System.out.print(binaryNum[j]); 
    }  
	//prime no
	static void isPrime(int n)
	{ 
		int i=0;
	    int flag=0;
		for(i=2;i<=n;i++)
		{
			if(n%2 ==0)
			{
				flag=0;
			}
			else
			{
				flag=1;
			}
	   }
		
		 if(flag==0) 
		 {
			 System.out.println("\n\n No "+n +" is not prime");
		  }
		 else 
		 { 
			 System.out.println("\n\n No "+n +" is prime"); 
		 }
		 
	}
	
	//factorial of no
	public static long factorial()
	{
		int n1 = Integer.parseInt(args[0]);
		int fact=1;
		for(int i=1; i<n1;i++)
		{
			fact = fact*i;
		}
		return fact;
	}
	public static void main(String[] args) 
	{
		System.out.println("Enter any no :");
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		System.out.println("The nth harmonic no of "+n +" is " +nthHarmonic(n));

		System.out.println("\n The binary no of " +n +" is ");
		decToBinary(n);
		
		isPrime(n);
		
		System.out.println("The factorial of "+n +" is ");
		factorial();
		
		System.out.println("\n Enter no");
		String d= sc.next();
		sinofangle(d);
		
	}

}
