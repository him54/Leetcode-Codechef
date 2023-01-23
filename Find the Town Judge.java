class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] nums = new int[n];
        for(int i=0; i<trust.length; i++){
            nums[trust[i][0]-1]--;  
            nums[trust[i][1]-1]++; 
        }
        for(int i=0; i<n; i++){
            if(nums[i] == (n-1)) 
            {
                return i+1;
            }
        }
        return -1;
    }
}
