class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int total = 0;
        int num = 0;
        int start = 0;
        
        for(int i = 0; i < gas.length; i++){
            total += gas[i] - cost[i];
            num += gas[i] - cost[i];
            if(num < 0){
                num = 0;
                start = i + 1;
            }
        }
        if(total < 0)
        {
           return -1;
        }
        return start;
    }
}
