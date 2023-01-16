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
            int N = sc.nextInt(); // Take a input integer 
            ArrayList<int[]> list = new ArrayList<>();
           
            for (int i = 0; i < N; i++)
            {
                int Num = sc.nextInt();
                list.add(new int[] {Num, i});
            }
            for (int i = 0; i < N; i++)
            {
                int Num = sc.nextInt();
                list.add(new int[] {Num, i});
            }
            int min = Integer.MAX_VALUE; // calculate minimum value
            list.sort((A, B) ->  // sort the list
            {
                if (A[0] == B[0]) 
                {
                    return Integer.compare(A[1], B[1]);
                }
             return Integer.compare(A[0], B[0]);
            });

            HashMap<Integer, Integer> hm = new HashMap<>(); //Map interface which allows us to store key and value pair,
            int count = 0;
            for (int i = 0; i < 2 * N; i++) 
            {
                hm.put(list.get(i)[1], hm.getOrDefault(list.get(i)[1], 0) + 1); // calculate map frequency

                while(hm.size() == N)
                {
                    min = Math.min(min, list.get(i)[0] - list.get(count)[0]);
                    int num1 = hm.get(list.get(count)[1]);
                    if (num1 == 1) 
                    {
                        hm.remove(list.get(count)[1]);
                    } 
                    else
                    {
                        hm.put(list.get(count)[1], num1 - 1);
                    }
                    count++;
                }
            }
            System.out.println(min);
        }
       // System.out.println(min);
	}
}

