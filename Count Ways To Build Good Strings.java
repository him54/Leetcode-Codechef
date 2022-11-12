import java.util.*;
class Solution {
        public int countGoodStrings(int low, int high, int zero, int one) {
            int dp[] = new int[high + 1];
            int diff = 0;
            int Mod = 1000000007;
            dp[0] = 1;
            for (int i = 1; i <= high; ++i) {
                if (i >= zero)
                {
                    dp[i] = (dp[i] + dp[i - zero]) % Mod;
                }
                if (i >= one)
                {
                    dp[i] = (dp[i] + dp[i - one]) % Mod;
                }
                if(i >= low)
                {
                    diff = (diff + dp[i]) % Mod;
                }
        }
        return diff;
    }
}
