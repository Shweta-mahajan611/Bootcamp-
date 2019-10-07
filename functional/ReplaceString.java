package replaceString;

import java.util.Scanner;

public class ReplaceString
{

	public static void main(String[] args) 
	{
		System.out.println("Enter username ");
		Scanner sc = new Scanner(System.in);
		String uname = sc.next();
		String str = "Shweta";
		
		System.out.println("String before replaced ");
		System.out.println("Hello "+uname +", How are you? ");
		
		String replace = uname.replace(uname,str);
		System.out.println("String after replaced ");
		System.out.println("Hello "+replace +", How are you? ");
	}

}
