import java.util.*;
class Solution {
 public int maxProfit(int k, int[] prices) {
    int n = prices.length;
    if(prices.length == 0)
    {
      return 0;
    }
    int[][] dp = new int[k + 1][n];
    for(int t = 1; t<=k; t++)
    {
      int max = Integer.MIN_VALUE;
      for(int d = 1; d < prices.length; d++)
        {
          if(dp[t - 1][d -1] - prices[d - 1] > max)
          {
              max = dp[t - 1][d -1] - prices[d - 1];
          }
          if(max + prices[d] > dp[t][d - 1])
          {
             dp[t][d] = max + prices[d];
          }
           else
          {
           dp[t][d] = dp[t][d - 1];
          }

        }
    }
    return dp[k][n - 1];
}
}
