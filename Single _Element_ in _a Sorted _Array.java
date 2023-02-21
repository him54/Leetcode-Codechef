class Solution {
    public int singleNonDuplicate(int[] nums) {
        int n = nums.length;
        int left = 0;
        int right = n - 1;
        if(left == right)
        {
            return nums[0];
        }
        while(left < right)
        {
            int mid = (left + right) / 2;
            int idx = mid;
            if(nums[mid] == nums[mid - 1])
            {
                idx = mid;
            }
            else if(nums[mid] == nums[mid + 1])
            {
                idx = mid + 1;
            }
            else
            {
                return nums[mid];
            }
            if(idx % 2 != 0)
            {
                left = idx + 1;
            }
            else{
                right = idx - 2;
            }
        }
        return nums[right];
    }
}
