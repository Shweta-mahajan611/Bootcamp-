package carloan;

public class CarLoan
{

	public static void main(String[] args) 
	{
		double principal=Double.parseDouble(args[0]);
		double years=Double.parseDouble(args[1]);
		double rate=Double.parseDouble(args[2]);
		
		double r=(rate/(12*100));
		double n=(12*years);
		
		double payment= (principal*r)/(1-Math.pow(1+r, -n));
		double interest = payment*n-principal;
		System.out.println("Monthly payment = "+payment);
		System.out.println("Total interest = "+interest);

	}

}
