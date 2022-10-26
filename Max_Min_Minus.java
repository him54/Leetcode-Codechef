/* package codechef; // don't place package name! */

import java.util.*;

import java.lang.*;

import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */

class Codechef

{

	public static void main (String[] args) throws java.lang.Exception	{

	  Scanner sc = new Scanner(System.in);

	  int T = sc.nextInt();

	  while(T-->0)

	  {

	       int A = sc.nextInt();

	       int B = sc.nextInt();

	       int C = sc.nextInt();

	       

	       int max = 0;

	       int min = 0;

	       int chef = 0;

	       max = Math.max(A, B);

	       max = Math.max(max, C);

	       

	       min = Math.min(A, B);

	       min = Math.min(min, C);

	       

	       System.out.println(max - min);

	  }

	}

}
