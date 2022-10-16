class Solution {
    public int minDifficulty(int[] jobDifficulty, int d) {
        
        int[][] dp = new int[d+1][jobDifficulty.length+1];
        
        if(d > jobDifficulty.length)
        {
            return -1;
        }
        for(int i=1; i <= jobDifficulty.length; i++)
        {
            dp[1][i]= Math.max( dp[1][i-1], jobDifficulty[i-1]);
        }
         for(int i=2; i<=d; i++)
         {
            for(int j=i; j<=jobDifficulty.length; j++)
            {  
                dp[i][j] = Integer.MAX_VALUE;
                int curr = 0;
                for(int k=j; k>=i; k--) 
                {
                    curr = Math.max(curr, jobDifficulty[k-1]);
                    dp[i][j] = Math.min( dp[i][j], dp[i-1][k-1] + curr);
                }
            }
        }
        return dp[d][jobDifficulty.length];
    }
