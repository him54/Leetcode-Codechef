class Solution {
    static final int MOD = 1_000_000_007;
    public int waysToReachTarget(int target, int[][] types) {
        List<ArrayList<Integer>> list1 = new ArrayList<>();
        
        for (int[] type : types) 
        {
            ArrayList<Integer> list2 = new ArrayList<>();
            for (int i : type) {
                list2.add(i);
            }
            list1.add(list2);
        }
        
        int[] dp = new int[target + 1];
        dp[0] = 1;
        
        for (ArrayList<Integer> list : list1)
        {
            for (int i = target; i >= 0; i--) {
                for (int j = 1; j <= list.get(0) && i - j * list.get(1) >= 0; j++) 
                {
                    dp[i] = (dp[i] + dp[i - j * list.get(1)]) % MOD;
                }
            }
        }
        return dp[target];
    }
}
