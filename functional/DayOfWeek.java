package dayofweek;

import java.util.Scanner;

public class DayOfWeek
{

	public static void main(String[] args) 
	{
		int y0,m0,d0=0,x=0;
		System.out.println("Enter the date(dd/mm/yyyy) : ");
		Scanner sc = new Scanner(System.in);
		String date=sc.nextLine();
		
		String datearr[]=date.split("/");
		int day=Integer.parseInt(datearr[0]);
		int month=Integer.parseInt(datearr[0]);
		int year=Integer.parseInt(datearr[0]);
		
		System.out.println(day +"\n" +month +"\n" +year +"\n");
		
		if((month>=1 && month<=12) ||(day>=1 && day<=31))
		{
			 y0= year-(14-month)/12;
			 x= y0+(y0/4)- (y0/100) + (y0/400);
			 m0= month+12*((14-month)/12)-2;
			 d0= (day+x+31*m0/12)%7;
		}
		switch(d0)
		{
			case 1: 
				System.out.println("Monday"); 
				break;
			case 2: 
				System.out.println("Tuesday"); 
				break;
			case 3: 
				System.out.println("wednesday"); 
				break;
			case 4: 
				System.out.println("Thirsday"); 
				break;
			case 5: 
				System.out.println("Friday"); 
				break;
			case 6: 
				System.out.println("Saturday"); 
				break;
			case 7: 
				System.out.println("Sunday"); 
				break;
			
		}

	}

}
