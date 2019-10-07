package harmonicNumber;

public class HarmonicNo
{
	static double nthHarmonic(int n)
	{
		float harmonic=1;
		for(int i=2;i<=n;i++)
		{
			harmonic += (float)1/i;
		}
		return harmonic;
	}
	public static void main(String[] args) 
	{
		int n=Integer.parseInt(args[0]);
		System.out.println(nthHarmonic(n));

	}

}
