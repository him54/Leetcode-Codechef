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
		    int N = sc.nextInt(); 
		    String A = sc.next();// Take a string input A and B
		    String B = sc.next();
		    
		    int num1 = 0;
		    int num2 = 0;
		    for(int i = 0; i<N; i++)
		    {
		        if(A.charAt(i) == '1') 
		        {
		            num1++;
		        }
		        if(B.charAt(i) == '1')
		        {
		            num2++;
		        }
		    }
		    if(num1 == num2)
		    {
		        System.out.println("YES");
		    }
		    else{
		        System.out.println("NO");
		    }
		}
	}
}
