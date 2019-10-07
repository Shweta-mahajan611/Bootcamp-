package names;

import java.util.Scanner;

public class DoubleOpt 
{

	public static void main(String[] args) 
	{
		double a,b,c;
	    double res1,res2,res3,res4;
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter the no.s :");
		a=sc.nextDouble();
		b=sc.nextDouble();
		c=sc.nextDouble();
		
		res1=a+(b*c);
		System.out.println("the result of [a+b*c] is "+res1);
		
		res2=(a*b)+c;
		System.out.println("the result of [a*b+c] is "+res2);
		
		res3=c+(a/b);
		System.out.println("the result of [c+a/b] is "+res3);
		
		res4=(a%b)+c;
		System.out.println("the result of [a%b+c] is "+res4);

	}

}
