class Solution {
    public int minImpossibleOR(int[] nums) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int num : nums)
        {
            hm.put(num, hm.getOrDefault(num, 0) + 1); //Returns the specified default value if the mapping for the specified key is not found in the hashmap
        }
        
        for(int t = 0; t< 31; t++)
        {
            if(!hm.containsKey(1 << t)) //Check whether a particular key is being mapped into the Map or not.
            {
                return 1 << t;
            }
        }
        return - 1;
    }
}
 
