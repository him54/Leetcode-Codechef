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
	      String S = sc.next();
	      if(S.charAt(0) == S.charAt(S.length() - 1))
	      {
	          System.out.println(S.length() - 2);
	      }else{
	          System.out.println(2);
	      }
	  }
	}
}
