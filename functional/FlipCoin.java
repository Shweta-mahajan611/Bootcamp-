package flipcoin;

import java.util.Random;

public class FlipCoin 
{
	public String chanceFun()
	{
		Random r = new Random();
		int chances=r.nextInt(2);
		if(chances==1)
		{
			return "tails";
		}
		else
		{
			return "heads";
		}
	}
}
