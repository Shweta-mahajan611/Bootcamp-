package printinitials;

import java.util.Scanner;

public class PrintInitials
{
	static int i;
	static int j;
	
	static String printInitials(String name) 
    {
		System.out.print(Character.toUpperCase(name.charAt(0))); 
			  
		for (i = 1; i < name.length() - 1; i++) 
		if (name.charAt(i) == ' ') 
			    System.out.print(" " + Character.toUpperCase(name.charAt(i + 1))); 
		 char initial= Character.toUpperCase(name.charAt(i+1));
		return name;
		
       
     }
	//for L
	static void patternL()
    {
     	
     	for(i=1;i<=9;i++) 
     	{
     		for(int j=1;j<3;j++)
     		{  
     			System.out.println("*");
     		}
     		if(i>7)
     		{
     			for(j=1;j<=9;j++)
     			{
     				System.out.println("*");
     			}
     		}
     	}
    } 

	public static void main(String[] args) 
	{ 
		
		System.out.println("Enter your full name : ");
		Scanner sc= new Scanner(System.in);
		String name=sc.nextLine();
		
		String data= printInitials(name);
		char arr[]= data.toCharArray();
		for(int i=0;i<arr.length;i++)
		{
			switch(name.charAt(i+1))
			{
				case 'A':{ System.out.println(" A ");}
				continue;
				case 'B': {System.out.println(" B ");}
				continue;
				case 'C':{System.out.println(" C ");}
				continue;
                case 'D':{System.out.println(" D ");}
				continue;
        		case 'E':{ System.out.println(" E ");}
				continue;
				case 'F': {System.out.println(" F ");}
				continue;
	    		case 'G': {System.out.println(" G ");}
				continue;
	    		case 'H': {System.out.println(" H ");}
				continue;
	    		case 'I':{System.out.println(" I ");}
				continue;
	    		case 'J': {System.out.println(" J ");}
				continue;
	    		case 'K': {System.out.println(" K ");}
				continue;
        		case 'L': {System.out.println(" L ");
        				patternL();  }
				continue;
				case 'M':{ System.out.println(" M ");}
				continue;
				case 'N': {System.out.println(" N ");}
				continue;
				case 'O':{ System.out.println(" O ");}
				continue;
				case 'P': {System.out.println(" P ");}
				continue;
				case 'Q': {System.out.println(" Q ");}
				continue;
				case 'R': {System.out.println(" R ");}
				continue;
				case 'S': {System.out.println(" S ");}
				continue;
				case 'T': {System.out.println(" T ");}
				continue;
				case 'U': {System.out.println(" U ");}
				continue;
				case 'V': {System.out.println(" V ");}
				continue;
				case 'W': {System.out.println(" W ");}
				continue;
				case 'X': {System.out.println(" X ");}
				continue;
				case 'Y': {System.out.println(" Y ");}
				continue;
				case 'Z': {System.out.println(" Z ");}
				continue;
			}
		}
	}
	
	
	 
}
