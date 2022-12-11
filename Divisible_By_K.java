/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
    static int gcd(int n1, int n2)
    {
        while(n1 != n2)
        {
            if(n1 > n2)
            {
                n1 = n1 - n2;
            }
            else{
                n2 = n2 - n1;
            }
        }
        return n2;
    }
	public static void main (String[] args) throws java.lang.Exception
	{
	  Scanner sc = new Scanner(System.in);
	  int T = sc.nextInt();
	  while(T-->0)
	  {
	      int N = sc.nextInt(); // Take a input N and K
	      int K = sc.nextInt();
	      int[] arr = new int[N]; // Take a input array
	      
	      for(int i = 0; i<N; i++){
	          arr[i] = sc.nextInt();
	      }
	      
	      for(int i = 0; i<N; i++){
	          K = K / gcd(K, arr[i]);
	      }
	      if(K == 1)
	      {
	          System.out.println("YES");
	      }
	      else{
	          System.out.println("NO");
	      }
	  }
	}
}
