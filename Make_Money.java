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
		    int N = sc.nextInt(); // Take a input N , X and C
		    int X = sc.nextInt();
		    int C = sc.nextInt();
		    
		    int[] arr = new int[N]; // Take a input of Array
		    for(int i = 0; i<N; i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		    long sum = 0;
		    int count = 0;
		    for(int i = 0; i<N; i++)
		    {
		        if(X - arr[i] > C)
		        {
		            sum += X;
		            count += C;
		        }
		        else{
		            sum = sum + arr[i];
		        }
		    }
		    System.out.println(sum - count); // subtract the value of sum and count
		}
	}
}
