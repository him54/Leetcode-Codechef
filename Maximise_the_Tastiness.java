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
		   	int x = sc.nextInt();
		   	int y = sc.nextInt();
		   	int z = sc.nextInt();
		   	if(x==y && y==z && x==z)
		   	{
	        System.out.println("YES");
	        }
	        else if(x!=y && y!=z && x!=z)
	        {
	            System.out.println("NO");
	        }
	        else
	        {
	           if(x==y && x!=z)
	            {
	                if(x<z)
	                {
	                    System.out.println("YES");
	                }
	                else
	                {
	                    System.out.println("NO");
	                }
	            }
	            else if(y==z && y!=x)
	            {
	                if(x>z)
	                {
	                    System.out.println("YES");
	                }
	                else
	                {
	                    System.out.println("NO");
	                }
	            }
	            else
	            {
	                if(x<y)
	                {
	                    System.out.println("YES");
	                }
	                else
	                {
	                    System.out.println("NO");
	                }
	            }
	            
	        }
	     }
    }
}
