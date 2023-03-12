import java.util.*;
import java.util.HashMap;
class Solution {
    public long beautifulSubarrays(int[] nums) {
        long sum = 0;
        long res = 0;
        HashMap<Long, Long> hm = new HashMap<>();
        hm.put(0L, 1L);
        for (int i : nums) {
            sum ^= i;
            if (hm.containsKey(sum)) 
            {
                res += hm.get(sum);
                hm.put(sum, hm.get(sum) + 1);
            }
            else 
            {
                hm.put(sum, 1L);
            }
        }
        return res;
    }
}
