import java.util.*;
class Solution {
    public int[] divisibilityArray(String word, int m) {
        int[] arr = new int[word.length()];
        long nums = 0;
        
        for(int i = 0; i<word.length(); i++)
        {
            nums = (nums * 10 + (word.charAt(i) - '0')) % m;
            
            if(nums == 0)
            {
                arr[i] = 1;
            }
        }
        return arr;  // Time complexity - nlogn
    }
}
