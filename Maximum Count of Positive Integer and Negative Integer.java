import java.util.*;
import java.io.*;
class Solution {
    public int maximumCount(int[] nums) {
        long num1 = 0;
        long num2 = 0;
        
        for(int i=0; i<nums.length; i++){
            if(nums[i]>0)
            {
                num1++;
            }
            
            else if(nums[i]<0)
            {
                num2++;
            }
        }
        
        return (int)Math.max(num1, num2);
    }
}
