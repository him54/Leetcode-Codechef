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
	       long N = sc.nextLong(); // Take a input of N and K
	       long K = sc.nextLong();
	   
	       long val = (N *(N - 1)) / 2;  //count the number of dots in T(n) 
	       if(K < N / 2)
	       {
	           long num =  N - 2 * K;
	           val -= (num * (num-1)) / 2;
	       }
	       System.out.println(val);
	   }
	}
}
