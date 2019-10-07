package temperatureconversion;

import java.util.Scanner;

public class TemperratureConversion 
{

	public static void main(String[] args) 
	{
		
		float celsius,fahren;
	    Scanner in = new Scanner(System.in);
	 
	    System.out.println("Enter temperature in Fahrenheit ");
	    fahren = in.nextInt();
	 
	    fahren= ((fahren - 32)*5)/9;
	 
	    System.out.println("temperature in Celsius = " + fahren);
	    
	    System.out.println("Enter temperature in celsius ");
	    celsius = in.nextInt();
	 
	    
	    float fahrenheit = (float) ((9.0/5.0)*celsius + 32);
        System.out.println("Temperature in Fahrenheit is : "+fahrenheit);
	  

	}

}
