package stopwatch;

import java.util.Date;
import java.util.Scanner;

public class StopWatch 
{
	static int start()
	{
		Date time = new Date();
		System.out.println("Start time is : ");
		return time.getSeconds();
	}
	static int stop()
	{
		Date time = new Date();
		System.out.println("Stop time is : ");
		return time.getSeconds();
	}
	static int elapsedtime(int a, int b)
	{
		System.out.println("Elapsed Time is : ");
		return b-a;
	}
	public static void main(String[] args) 
	{
	int ch;
	int a=0;
	int b=0;
	do
	{
	 Scanner sc = new Scanner(System.in);
	 System.out.println(" 1. Start \n 2. Stop \n Enetr ur choice : ");
	 ch = sc.nextInt();
	 switch(ch)
	 {
	 case 1: a = start();
	 		System.out.println(a);
	 		break;
	 case 2: b = stop();
	        System.out.println(b);
	        //break;
	 default: int c = elapsedtime(a,b);
	 		System.out.println(c);
	 }
	}while(ch>=1 && ch<=2);
	}
}
