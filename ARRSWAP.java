/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
	   Scanner sc = new Scanner(System.in); // Take a user input
	   int T = sc.nextInt();
	   while(T-->0)
	   {
	       int N = sc.nextInt(); //  The number of elements in each array
	       int[] A = new int[N];
	       int[] B = new int[N];
	       
	       int[] chef = new int[A.length + B.length];
	       
	       for(int i = 0; i<N; i++)
	       {
	           A[i] = sc.nextInt();
	       }
	       for(int i = 0; i<N; i++)
	       {
	           B[i] = sc.nextInt();
	       }
	       System.arraycopy(A, 0, chef, 0, A.length); //method copies a source array from a specific beginning position to the destination array
	       System.arraycopy(B, 0, chef, A.length, B.length);
	       
	       Arrays.sort(chef); // sorts the specified range of the specified array of objects into ascending order, according to the natural ordering of its elements.
	       int Min = chef[2 * N - 1] - chef[0] ;
	       for(int i = 0; i<=N; i++)
	       {
	           Min = Math.min(Min, chef[i + N - 1] - chef[i]);
	       }
	       System.out.println(Min); //Minimum posiible values
	   }
	}
}
