package poweroftwo;

public class PwerOfTwo 
{

	public static void main(String[] args)
	{
		int n=Integer.parseInt(args[0]);
		int i=0;
		int power=1;
		System.out.println("Power of two thar are less than 2^"+n);
		while(i<=n)
		{
			System.out.println("2^"+i +"= "+power);
			power=power*2;
			i++;
		}
	}

}
