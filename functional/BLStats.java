package libraryfunctions;

import java.util.Arrays;
import java.util.Scanner;

public class BLStats
{
	static double Compute(double C,double T,double r)
	{
	double g=(double)Math.pow(1+r,T);
	double CI= C/g;	
	return CI;
	}
	static int MaxValue(int arr[],int n)
	{
			
			Arrays.sort(arr);
					return arr[n];
	}
	static int MinValue(int arr[],int n)
	{
			
			Arrays.sort(arr);
					return arr[0];
	}

	static String MaxValue(String arr[],int n)
	{
			
			Arrays.sort(arr);
			Arrays.toString(arr);
			return arr[n];
	}
	static String MinValue(String arr[],int n)
	{
			
			Arrays.sort(arr);
			Arrays.toString(arr);
			return arr[1];
	}
	static void CheckCollinearUsingSlope(float x1,float x2,float x3,float y1,float y2,float y3)
	{
		
		float AB=(y2-y1)/(x2-x1);
		System.out.printf("%.2f",AB);
		
		System.out.println();
		float BC=(y3-y2)/(x3-x2);
		System.out.printf("%.2f",BC);
		System.out.println();
		if(AB==BC)
		{
			System.out.println("They Collinear");
		}
		else
		{	
			System.out.println("they not collinear");
		}		
	}
	static void CheckCollinearUsingArea(float x1,float x2,float x3,float y1,float y2,float y3)
	{
		float AD=(x1-x2)*(y2-y3);
		float BC=(x2-x3)*(y1-y2);
		float sub=AD-BC;
		float area=(1/2)*sub;
		if(area==0)
		{
			System.out.println("They Collinear");
		}
		else
		{	
			System.out.println("they not collinear");
		}
		
	}
		public static void main(String[] args)
		{
			Scanner sc=new Scanner(System.in);
			System.out.println("Enter amount");	
			double C=sc.nextDouble();
			System.out.println("Enter time period");
			double T=sc.nextDouble();
			System.out.println("Enter rate of interest");
			double r=sc.nextDouble();

			BLStats s1=new BLStats();
			double j=s1.Compute(C,T,r);
			System.out.print(j);
			System.out.println();
			System.out.println("Enter size");
			int size=sc.nextInt();
			int arr[]=new int[size];
		
			int n=size-1;
			System.out.println("Enter element");
				for(int i=0;i<=n;i++)
				{
					arr[i]=sc.nextInt();
				}
			int max=s1.MaxValue(arr, n);
			int min=s1.MinValue(arr, n);
			System.out.println("max value:"+max);
			System.out.println("min value:"+min);
	
			
			String[] s=new String[size];
			System.out.println("Enter String Element");
				for(int i=0;i<=n;i++)
				{
					s[i]=sc.nextLine();
				}
			String Max=s1.MaxValue(s,n);
			System.out.println("max value String:"+Max);
			String Min=s1.MinValue(s,n);
			System.out.println("min value String:"+Min);

			float x1,x2,x3,y1,y2,y3;
			System.out.println("enter co-ordinate of x & yof A");
			x1=sc.nextInt();
			y1=sc.nextInt();
			System.out.println("enter co-ordinate of x & yof B");
			x2=sc.nextInt();
			y2=sc.nextInt();
			System.out.println("enter co-ordinate of x & yof C");
			x3=sc.nextInt();
			y3=sc.nextInt();
			s1.CheckCollinearUsingSlope(x1,x2,x3,y1,y2,y3);
			s1.CheckCollinearUsingArea(x1,x2,x3,y1,y2,y3);
		}

}
