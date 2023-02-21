class Solution {
    public int longestSubarray(int[] nums) {
        int max = 0;
        int res = 1;
        int curr = 0;
        for (int num : nums)
        {
            max = Math.max(max, num);
        }
        for (int num : nums)
        {
            if (num == max) 
            {
                res = Math.max(res, ++curr);
            }else 
            {
                curr = 0;
            }
        }
        return res;
    }
}
