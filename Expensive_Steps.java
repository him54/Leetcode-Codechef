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
		    int N = sc.nextInt(); // Take a input of N x1, y1, x2, y2
		    int x1 = sc.nextInt();
		    int y1 = sc.nextInt();
		    int x2 = sc.nextInt();
		    int y2 = sc.nextInt();
		    
		    if(x1 <1 && y1 > N && x2 < 1 && y2 > N)
		    {
		        System.out.println(0);
		    }
		    else if(x1 <1 || y1>N)
		    {
		        System.out.println(Math.min(Math.min(N-x2+1, N-y2+1), Math.min(x2, y2)));
		        continue;
		    }
		    else if(x2<1 || y2 > N)
		    {
		        System.out.println(Math.min(Math.min(N - x1 + 1, N - y1 + 1), Math.min(x1, y1)));
		        continue;
		    }
		    int x =  Math.min(Math.min(N-x1+1, N-y1+1), Math.min(x1, y1)); // minimum value will be calculte of x
		    int y =  Math.min(Math.min(N-x2+1, N-y2+1), Math.min(x2, y2)); // minimum value will be calculte by y
		    int z =  Math.abs(x1 - x2) + Math.abs(y1 - y2); // absulute value
		    System.out.println(Math.min(z, x+y));
		}
	}
}
