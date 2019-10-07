package quadratic;

import java.util.Scanner;

public class Quadratic
{

	public static void main(String[] args)
	{
		Scanner sc= new Scanner(System.in);
        System.out.println("Enter A value ");
        int a=sc.nextInt();
        System.out.println("Enter B value ");
        int b=sc.nextInt();
        System.out.println("Enter c value ");
        int c=sc.nextInt();
		
		double delta= ((b*b)-(4*a*c));
		int sroot=(int) Math.sqrt(delta);
		double root1= (-b+sroot)/(2*a);
		double root2= (-b-sroot)/(2*a);
		System.out.println("Root1 of x is "+root1);
		System.out.println("Root2 of x is "+root2);

	}

}
