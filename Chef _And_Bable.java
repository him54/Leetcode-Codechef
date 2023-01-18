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
		    int[] A = new int[N];
		   
		    for(int i = 0; i<N; i++)
		    {
		        A[i] = sc.nextInt();
		    }
		    long num1 = Integer.MIN_VALUE;
		    long num2 = Integer.MAX_VALUE;
		    
		    for(int i = 0; i<N; i++)
		    {
		        if(A[i] >= 0 && A[i]<num2)
		        {
		            num2 = A[i];
		        }
		        if(A[i] < 0 && A[i] > num1)
		        {
		            num1 = A[i];
		        }
		    }
		    long min = Math.min(num2, Math.abs(num1));
		    System.out.println(min - 1);
		}
	}
}
