class Solution {
    public int[] leftRightDifference(int[] nums) {
        int n = nums.length;
        ArrayList<Integer> list = new ArrayList<>();
        int[] arr = new int[n];
        int sum = 0;
        for(int idx : nums){
            sum += idx;
        }
        int sum1 = 0;
        for(int i=0; i<nums.length; i++)
        {
            int sum2 = sum - sum1;
            arr[i] = Math.abs(sum2-sum1-nums[i]);
            sum1 += nums[i];
        }
        return arr;
        
    }
}
