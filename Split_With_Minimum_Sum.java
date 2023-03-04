import java.util.Arrays;
import java.io.*;
class Solution {
    public int splitNum(int num) {
        String S = Integer.toString(num);
        char[] nums = S.toCharArray();
        Arrays.sort(nums);
        String s1 = "";
        String s2 = "";
        
        
        for(int i=0; i<nums.length; i+=2)
        {
            s1 += nums[i];
        }
        for(int i=1; i<nums.length; i+=2)
        {
            s2 += nums[i];
        }
        
        int str1 = Integer.parseInt(s1);
        int str2 = Integer.parseInt(s2);
        
        return str1+str2;
    }
}
