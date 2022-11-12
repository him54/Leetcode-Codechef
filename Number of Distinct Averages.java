import java.util.*;
class Solution {
    public int distinctAverages(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length / 2; ++i) {
            set.add(nums[i] + nums[nums.length - 1 - i]);
        }
        return set.size();
    }
}
