import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		while(T-->0)
		{
		    int N = sc.nextInt();
		    String S = sc.next();
		    String R = sc.next();
		    
		    int count1 = 0;
		    int count2 = 0;
		    
		    for(int i = 0; i<N; i++)
		    {
		       if(S.charAt(i) == '1')
		       {
	                count1++;
	            }
	            if(R.charAt(i) == '1')
	            {
	                count2++;
	            }
	        }
	    
	        int Diff = Math.abs(count1-count2);
	        if(Diff%2 == 0)
	        {
	         System.out.println(1);
	        }
	        else
	        {
	           System.out.println(0);
		    }
		}
	}
}
