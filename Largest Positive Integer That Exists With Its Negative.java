class Solution {
    public int countDistinctIntegers(int[] nums) {
         ArrayList<Integer> list=new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            list.add(nums[i]);
        }
        for(int i=0;i<nums.length;i++)
        {
            int rev = 0;
            while(nums[i]!=0)
            {
                int dig = nums[i]%10;
                rev = rev*10+dig;
                nums[i] = nums[i]/10;
            }
            list.add(rev);
        }
        HashSet<Integer> hs = new HashSet<>();
        
        for(int i=0; i<list.size(); i++){
            hs.add(list.get(i));
        }
        return hs.size();
    }
}
