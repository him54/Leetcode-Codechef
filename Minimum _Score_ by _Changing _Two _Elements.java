import java.util.*;
class Solution {
    public int minimizeSum(int[] nums) {
        Arrays.sort(nums); //Sorting an array
        return Math.min(nums[nums.length-1]-nums[0], Math.min(nums[nums.length-1] - nums[2], Math.min(nums[nums.length - 3] - nums[0], nums[nums.length - 2] - nums[1])));//Compares the variable min with all elements of the array and assigns the minimum value to min
    }
}
