/* package codechef; // don't place package name! */

import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner sc = new Scanner(System.in); //TAKE A USER INPUT
		int T = sc.nextInt();
		while(T-->0)
		{
		    int N = sc.nextInt();
		    String S = sc.next();
		    HashSet<Character> SET = new HashSet<>(); //HashSet class is used to create a collection that uses a hash table for storage
		    boolean val = false; //boolean variable that signals when some condition exists in a program
		    for(int i = 0; i<N; i++)
		    {
		        if(SET.contains(S.charAt(i)))
		        {
		            val = true;
		            break;
		        }
		        SET.add(S.charAt(i));
		    }
		    if(val == true)
		    {
		        System.out.println(N - 2);
		    }
		    else{
		        System.out.println(-1);
		    }
		}
	}
}
