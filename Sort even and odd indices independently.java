class Solution {
    public int[] sortEvenOdd(int[] nums) {
        PriorityQueue<Integer> max = new PriorityQueue<Integer>((a,b)->(b-a));
        PriorityQueue<Integer> min = new PriorityQueue<Integer>((a,b)->(a-b));
        
        for(int i = 0; i<nums.length;)
        {
            min.offer(nums[i]);
            i = i+2;
        }
        for(int i=1; i<nums.length;)
        {
            max.offer(nums[i]);
            i = i+2;
        }
        int i = 0;
        while(!min.isEmpty())
        {
            nums[i] = min.poll();
            i = i+2;
        }
        i = 1;
        while(!max.isEmpty())
        {
            nums[i] = max.poll();
            i = i+2;
        }
        return nums;
    }
    
}
