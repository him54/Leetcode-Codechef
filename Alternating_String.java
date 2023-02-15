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
		for(int i=0; i<T; i++){
		    int count = 0;
		    int val = 0;
		    int N = sc.nextInt();
		    String S = sc.next();
		    for(int j=0; j<N; j++){
		        if(S.charAt(j) == '1'){
		            count += 1;
		        }
		        else{
		            val += 1;
		        }
		    }
		    if(count == val)
		    {
		        System.out.println(count*2);
		    }
	        else if(count < val)
	        {
	            System.out.println(count*2+1)
	        }
	        else
	        {
	            System.out.println(val*2+1);
	        }
		}
	}
}
