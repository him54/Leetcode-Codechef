class Solution {
    public int searchInsert(int[] nums, int target) {
        int n = nums.length;
        if(target > nums[n- 1])
        {
            return n;
        }
        int left = 0;
        int right = n - 1;
        while(left < right)
        {
            int num = left + (right - left ) / 2;
            if(target > nums[num])
            {
                left = num + 1;
            }
            else
            {
                right = num;
            }
        }
        return left;
    }
}
