import java.util.*;
class Solution {
    public int minMaxDifference(int num) {
        String S = Integer.toString(num);
        int max = num;
        int min = num;
        for (int i = 0; i < 10; i++) 
        {
            for (int j = 0; j < 10; j++)
            {
                String nums = S;
                nums = nums.replace((char) ('0' + i), (char) ('0' + j));
                int nums1 = Integer.parseInt(nums); // Convert integer value in String 
                if(nums1 > max)
                {
                    max = nums1;
                }
                if (nums1 < min && (j > 0 || i > 0)) 
                {
                    min = nums1;
                }
            }
        }
        int nums2 = max - min;
        return nums2;

    }
}
