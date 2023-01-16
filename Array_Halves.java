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
		    int[] P1 = new int[2 * N]; // Take a Array input  twice
		    int[] P2 = new int[2 * N];
		    
		    for(int i = 0; i<2 * N; i++)
		    {
		        P1[i] = sc.nextInt();
		    }
		    for(int i = 0; i<2 * N; i++)
		    {
		        P2[i] = P1[i];
		    }
		    Arrays.sort(P2); // sorts the specified range of the specified array of objects into ascending order, according to the natural ordering of its elements.
		    int num = P2[N - 1];
		    long idx = N; 
		    long chef = 0;
		    
		    for(int i = 0; i<idx; i++)
		    {
		        if(P1[i] > num)
		        {
		            chef = chef + idx - i;
		            idx++;
		        }
		    }
		    System.out.println(chef);
		}
	}
}
