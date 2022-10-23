class Solution {
    public long check(int mid,int[] arr,int[] cost){
         long sum=0;
         for(int i=0; i<arr.length; i++){
            sum+= 1l* Math.abs(mid-arr[i])*cost[i];
         }       
      return sum;
    }

    public long minCost(int[] nums, int[] cost) {
        int low = 0;
        int high = 1000000;
        while(low <= high)
        {
            int mid = (low + high)/2;
            long n1 = check(mid-1, nums, cost);
            long n2 = check(mid, nums, cost);
            long n3 = check(mid+1, nums, cost);
            if(n1>=n2 && n3>=n2)
            {
                return n2;
            }
            else if(n1<n2)
            {
              high = mid-1;
            }
            else{ 
                low = mid+1;
            }
       }
     return 0;
    }
}
