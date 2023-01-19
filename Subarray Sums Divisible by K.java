import java.util.*;
class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int n = nums.length;
        int res = 0;
        HashMap<Integer, Integer> map = new HashMap<>(); // Store reminder frequency
        map.put(0, 1);
        int sum = 0;
        int rem = 0;

        for(int i = 0; i<n; i++){
            sum += nums[i];
            rem = sum % k;
            if(rem < 0){ // reminder is negative then add k 
                rem += k;
            }
            if(map.containsKey(rem)){ // check reminder present then add old frequency in a map
              res += map.get(rem);
              map.put(rem, map.get(rem) + 1); // increment frequency
            }
            else {
                map.put(rem, 1);
            }
        }
        return res;
    }
}
