package decimal2binary;

import java.util.Scanner;

public class Decimal2Binary 
{

	static void decToBinary(int n) 
    { 
        // array to store binary number 
        int[] binaryNum = new int[1000]; 
   
        // counter for binary array 
        int i = 0; 
        int j=0;
        while (n > 0)  
        { 
            // storing remainder in binary array 
            binaryNum[i] = n % 2; 
            n = n / 2; 
            i++; 
        } 
        
        
        // printing binary array in reverse order 
       
        for (j = i - 1; j >= 0; j--) 
            System.out.print(binaryNum[j]); 
        
        //generate nibbles
        //String bin= binaryNum.toString();
        //String formatted = String.format("%08d", binaryNum);
      
    }    

	public static void main(String[] args)
	{
		int n ;
		System.out.println("Enter any no : ");
		Scanner sc = new Scanner(System.in);
		n = sc.nextInt();
        decToBinary(n); 
	}

}
