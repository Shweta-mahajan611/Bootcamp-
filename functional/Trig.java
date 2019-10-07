package trignometric;

public class Trig
{

	public static void main(String[] args) 
	{
		double degrees=45.0;
		double radians=Math.toRadians(degrees);
		
		double sinval=Math.sin(radians);
		System.out.println("Sin("+degrees +")="+sinval);
		
		double cosval=Math.cos(radians);
		System.out.println("Cos("+degrees +")="+cosval);
		
		double tanval=Math.tan(radians);
		System.out.println("Tan("+degrees +")="+tanval);
	}

}
