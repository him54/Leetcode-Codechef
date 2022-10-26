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

		    int N = sc.nextInt();

		    int Q = sc.nextInt();

		    int final_sum = 0;

		    int[] arr = new int[N];

		    for(int i = 0; i<arr.length; i++)

		    {

		        arr[i] = sc.nextInt();

		    }

		    for(int i = 0; i<N; i++){

		        final_sum += arr[i];

		    }

		    while(Q-->0){

		        int L = sc.nextInt();

		        int R = sc.nextInt();

		        int sub = R-L+1;

		        if(sub%2 == 0)

		        {

		            continue;

		        }else{

		            final_sum++;

		        }

		    }

		    System.out.println(final_sum);

		    

		}

	}

}
