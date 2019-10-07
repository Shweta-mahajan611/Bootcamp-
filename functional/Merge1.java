package mergesort;
import java.util.Arrays;

public class Merge1 
{
	private static final int len = 0;

	public static String[] combineString(String[] a1, String[] a2)
	{
        int length = a1.length + a2.length;
        String[] result = new String[length];
        System.arraycopy(a1, 0, result, 0, a1.length);
        System.arraycopy(a2, 0, result, a1.length, a2.length);
        return result;
    }
	 static void sort(String[] a3)
	 { 
		 int len = a3.length;
		
		  for(int i=0; i<=len-1; i++) 
		  { 
			  for(int j=i+1; j<=len-1; j++)
			  {
				 
				  if(a3[i].compareTo(a3[j])>0) 
				  { 
					  String temp = a3[i];
					  a3[i] = a3[j];
					  a3[j] = temp;
					  } 
				  } 
			  }
		  System.out.println("Array after sorting :"); 
		  for(int i=0; i<len; i++)
		  {
			  System.out.println(a3[i]);
		  } 
    }
	 
	public static void main(String[] args)
	{
		System.out.println("String before sorting :");
		String a1[] = {"red","green","yellow"};
		String a2[] = {"blue","black"};
		
        String a3[] = combineString(a1, a2);
        System.out.println("Array first :"); 
		  for(int i=0; i<a1.length; i++)
		  {
			  System.out.println(a1[i]);
		  } 
		  System.out.println("Array second :"); 
		  for(int i=0; i<a2.length; i++)
		  {
			  System.out.println(a2[i]);
		  } 
  
        System.out.println("concatenated String array : " + Arrays.toString(a3));
        
//       int len = a3.length;
          sort(a3);
     }
}
