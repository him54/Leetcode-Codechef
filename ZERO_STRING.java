/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in); // Take a user input
		int T = sc.nextInt();
		while(T-->0)
		{
		    int N = sc.nextInt();
		    String S = sc.next(); // Take a input string
		    
		    int count1 = 0;
		    int count2 = 0;
		    
		    for(int i = 0; i<N; i++){
		        if(S.charAt(i) == '0')
		        {
		            count2++;
		        }
		        else{
		            count1++;
		        }
		    }
		    if(count2 == 0)
		    {
		        System.out.println(1);
		        continue;
		    }
		    if(count1 == count2)
		    {
		        System.out.println(count1);
		        continue;
		    }
		    if(count1>count2)
		    {
		        System.out.println(count2+1);
		    }
		    else{
		        System.out.println(count1);
		    }
		}
	}
}
