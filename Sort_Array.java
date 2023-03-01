// class Solution {
//     public int[] sortArray(int[] nums) {
//         int n = nums.length - 1;
//         for(int i = 0; i<n; i++){
//             int minimum = i; 
//             for(int j = i+1; j<nums.length ; j++)
//             {
//                 if(nums[j] < nums[minimum])
//                 {
//                     minimum = j;
//                 }
//             }
//             int temp = nums[minimum];
//             nums[minimum] = nums[i];
//             nums[i] = temp;
//         }
//         return nums;  // TLE
//     }
// }


class Solution {
    public int[] sortArray(int[] nums) {

        int i=0;
        int[] res = new int[nums.length];
        PriorityQueue<Integer> que = new PriorityQueue<>();
        for(int num : nums)
        {
            que.offer(num);
        }
        while(!que.isEmpty())
        {
            res[i++] = que.poll();
        }
        return res;
    }
}
