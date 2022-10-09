class Solution {
    public int hardestWorker(int n, int[][] logs) {
        int d = logs[0][1] - 0;
        int employee_id = logs[0][0];
        
        for(int i = 1; i<=logs.length-1; i++){
            int res = logs[i][1] - logs[i-1][1];
            
            if(res == d)
            {
                employee_id = Math.min(employee_id, logs[i][0]);
            }
            if(res > d)
            {
                d = res;
                employee_id = logs[i][0];
            }
        }
        return employee_id;
    }
}
