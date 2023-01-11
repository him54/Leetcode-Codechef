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
		    int N = sc.nextInt(); // TAKE A INPUT OF X AND Y
		    int Y = sc.nextInt();
		    
		    int[] A = new int[N]; // TAKE A ARRAY INPUT 
		    for(int i = 0; i<N; i++)
		    {
		        A[i] = sc.nextInt();
		    }
		    
		    int num = A[0];
		    for(int i = 0; i<N; i++)
		    {
		        num = (num | A[i]);
		    }
		    int res = (Y ^ num);
		    if((res | num) == Y)
		    {
		        System.out.println(res);
		    }
		    else{
		        System.out.println(-1);
		    }
		}
	}
}
