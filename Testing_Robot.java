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

		while(T-->0){

		    int N = sc.nextInt();

		    int start = sc.nextInt();

		    String S = sc.next();

		    int l = start;

		    int r = start;

		    for(int i = 0;i<N;i++){

		        if(S.charAt(i) == 'R'){

		            start++;

		        }

		        if(S.charAt(i) == 'L'){

		            start--;

		        }

		        if (l < start){

		            l = start;

		        }

		        if(r > start){

		            r = start;

		        }

		        

		    }

		    System.out.println(l-r+1);

		}

	}
