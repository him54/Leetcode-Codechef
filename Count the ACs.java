/* package codechef; // don't place package name! */

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
		    int P = sc.nextInt();
		    int rem = P % 100;
		    if(rem==0)
		     {
	             System.out.println(P/100);
	         }
	        else
	        {
	            int sum = P/100;
	        
	            if(sum+rem>10)
	            {
	                System.out.println(-1);
	            }
	            else
	            {
	             System.out.println(sum + rem);
	             }
	    	}
 	    }
    }
}
  
