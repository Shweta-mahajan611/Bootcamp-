package names;

import java.util.Scanner;


public class PrintThreeNames
{
	public static void main(String[] args) 
	{
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter names :");
		String names=sc.nextLine();
		
		 String words[] = names.split(" ");
		 String reverse=""; 
		for(int i=words.length-1; i>=0; i--)
		{
			reverse = reverse+words[i]+" ";
		}	
		System.out.println("java PrintThreeNames "+reverse);
	}

}
