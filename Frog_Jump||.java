import java.io.*;
class Solution {
    public int maxJump(int[] stones) {
        int min_cost = stones[1] - stones[0];
        for(int i = 2; i<stones.length; i++)
        {
            min_cost = Math.max(min_cost, stones[i] - stones[i-2]);
        }
        return min_cost;
    }
}
