class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        int count = 0;
        long[] res = new long[nums.length];
        if (nums[nums.length - 1] > 0)
        {
            count++;
        }
        res[nums.length - 1] = nums[nums.length - 1];
        for (int i = nums.length - 2; i >= 0; i--) 
        {
            res[i] = res[i + 1] + nums[i];
            if (res[i] > 0)
            {
                count++; //Count Variable is incremented.
            }
            System.out.print(res[i] + " ");
        }
        System.out.println();  
        return count; //returns the value of count.
    }
}
