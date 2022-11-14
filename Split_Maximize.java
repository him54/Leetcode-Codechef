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
	      long N = sc.nextLong();
	      long sum = 0;
	      for(int i = 0; i<N; i++){
	          long x = sc.nextLong();
	          sum += x;
	      }
	      sum = (sum % 998244353) * ((sum - 1) % 998244353) % 998244353;
	      System.out.println(sum);
	  }
	}
}
