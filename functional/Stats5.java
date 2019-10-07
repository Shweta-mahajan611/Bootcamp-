package stats5;

public class Stats5
{

	public static void main(String[] args) 
	{
		double random[];
		double sum;
		double n1,n2,n3,n4,n5;
		System.out.println("random values between 0 and 1 are ");
		n1=Math.random();
		n2=Math.random();
		n3=Math.random();
		n4=Math.random();
		n5=Math.random();
		System.out.println("\n"+n1 +"\n"+n2 +"\n"+n3 +"\n"+n4 +"\n"+n5);
		
		sum=n1+n2+n3+n4+n5;
       double avg=sum/2;
       System.out.println("The avg  value is "+avg);
       double min=Math.min(n1,n2);
       System.out.println("The Min  value is "+min);
       double max=Math.max(n1, n2);
       System.out.println("The Max  value is "+max);
	}

}
