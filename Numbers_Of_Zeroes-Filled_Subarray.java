class Solution {
    public long zeroFilledSubarray(int[] nums) {
        long total = 0L;
        long count = 0L;

        for(int num : nums)
        {
            if(num == 0)
            {
                count++;
            }
            else
            {
                if(count > 0)
                {
                    total += count * (count + 1L) >> 1;
                    count = 0;
                }
            }
        }
         if(count > 0)
        {
            total += count * (count + 1L) >> 1;
        }
        return total;
    }
}
