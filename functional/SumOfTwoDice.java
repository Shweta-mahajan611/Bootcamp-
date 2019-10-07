package dice;

import java.util.Random;

public class SumOfTwoDice 
{

	public static void main(String[] args) 
	{
		Random r = new Random();
		int n1=r.nextInt(1);
		int n2=r.nextInt(6);
		System.out.println(n1);
		System.out.println(n2);
		System.out.println("Sum is "+(n1+n2));
		
	}

}
