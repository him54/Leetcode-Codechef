class Solution {
    public int fillCups(int[] amount) {
        PriorityQueue<Integer> que = new PriorityQueue<Integer>((a,b) -> (b - a)); // I have created a priority queue and i have marked as max priority queue
        for(int i : amount){
            que.offer(i);
        }
        int res = 0;
        while(!que.isEmpty())
        {
            int num1 = que.poll(); // first element that has the maximum capacity
            int num2 = que.poll(); // second element that has the maximum capacity
            
            if(num1<= 0 && num2<=0)
            {
                break; // I abort the process bcoz we have reached the final targets
            }
            num1--;
            num2--;
            que.offer(num1);
            que.offer(num2);
            res++;
        }
        return res;
    }
}
