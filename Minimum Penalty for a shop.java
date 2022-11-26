import java.util.*;
import java.io.*;
class Solution {
    public int bestClosingTime(String customers) {
        int n = customers.length();
        int sum = 0;
        int[] left = new int[n];
        int[] right = new int[n];
        
        for(int i = n-1; i>=0; i--)
        {
            if(customers.charAt(i) == 'Y')
            {
                sum++; 
            }
                right[i] = sum;
        }
        
        for(int i = 0; i<n; i++)
        {
            left[i] = sum;
            
            if(customers.charAt(i) == 'N')
            {
                sum++;
            }
        }
        
        int p = sum;
        int m = sum; 
        int res = n;
        
        for(int i = customers.length()-1; i>=0; i--)
        {
            p = right[i] + left[i];
            if(m >= p)
            {
                m = p;
                res = i;
            }
        }
        return res;
    }
}
