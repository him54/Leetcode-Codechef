class Solution {
    public int maximizeGreatness(int[] nums) {
        Arrays.sort(nums); // Sort the array in non-decreasing order
        int count = 0;
        int nums1 = 0;   // Two pointer nums1 and nums2
        int nums2 = 1;
        while (nums2 < nums.length) 
        {
            if (nums[nums1] < nums[nums2])
            {
                count++;
                nums1++;
                nums2++;
            }
            else 
            {
                nums2++;
            }
        }
        return count;
    }
}
