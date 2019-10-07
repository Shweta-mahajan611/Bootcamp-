package flipcoin;

public class FlipCoinDemo 
{

	public static void main(String[] args)
	{
		FlipCoin fc = new FlipCoin();
		float heads=0;
		float tails=0;
		int chances=10;
		for(int i=0;i<chances;i++)
		{
			if(Math.random()>0.5)
			{
				tails++;
			}
			else
			{
				heads++;
			}
		}
		System.out.println("Chances ="+chances);
		System.out.println("Heads ="+heads);
		System.out.println("Tails ="+tails);
		
		float hper=((heads/chances)*100);
		float tper=((tails/chances)*100);
		System.out.println("Heads Percentage ="+hper);
		System.out.println("Tails Percentage="+tper);
	}

}
