package windchill;

public class WindChill
{

	public static void main(String[] args) 
	{
		 double t = Double.parseDouble(args[0]);
	        double v = Double.parseDouble(args[1]);
	        if(t>=50 || v<3 && v>120)
	        {
	        double w = 35.74 + 0.6215*t + (0.4275*t - 35.75) * Math.pow(v, 0.16);
	        System.out.println("Temperature = " + t);
	        System.out.println("Wind speed  = " + v);
	        System.out.println("Wind chill  = " + w);
	        }
	        else
	        {
	        	System.out.println("Eneter the correct values...");
	        }
	}

}
