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
		    int[] arr = new int[N];
		    for(int i = 0; i<N; i++)
		    {
		        arr[i] = sc.nextInt();
		    }
		      int i = 0;
		      int j = N - 1;
		      int count = 0;
		    while(i <= j)
		    {
		        if(arr[i] == arr[j])
		        {
		            i++;
		            j--;
		        }
		        else if(arr[i] < arr[j])
		        {
		            arr[j] -= arr[i];
		            i++;
		            count++;
		        }
		        else{
		            arr[i] -= arr[j];
		            j--;
		            count++;
		        }
		    }
		    System.out.println(count);
		}
	}
}
