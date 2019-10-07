package palindromstring;

import java.util.Scanner;

public class AnagramString 
{

	public static void main(String[] args)
	{
		int i=0,j=0,match=0,nomatch=0;
		String str1,str2;
	    Scanner sc = new Scanner(System.in);
		System.out.print("Enter First String : ");
        str1 = sc.nextLine();
        System.out.print("Enter Second String : ");
        str2 = sc.nextLine();
		
		int length1=str1.length();
		int length2=str2.length();
 
		if(length1 == length2)
		{
			for(i=0;i<length1;i++)
			{
				for(j=0; j<length1; j++)
                {
                    if(str1.charAt(i) == str2.charAt(j))
                    {
                        match = 1;
                        break;
                    }
					/*
					 * else { match=0; break; }
					 */
                }
				
				  if(match == 0) 
				  { 
					  nomatch = 1; 
					  break; 
				  }
				 
            }
            if(nomatch == 1)
            {
                System.out.print("Strings are not Anagram to Each Other..!!");
            }
            else
            {
                System.out.print("Strings are Anagram");
            }
			}
		}
	}


