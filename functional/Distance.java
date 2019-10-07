package distance;

public class Distance 
{

	public static void main(String[] args) 
	{
		int x= Integer.parseInt(args[0]);
		int y= Integer.parseInt(args[1]);
		
		 double dist =(Math.sqrt(Math.pow(x,2) +Math.pow(y, 2)));
		 
		 System.out.println("distance from (" + x + ", " + y + ") to (0, 0) = " + dist);

	}

}
