class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] arr = new int[1001]; // Create a frequency array of size 1001
        for(int[] num : nums){ // start  iteration each of the array
            for(int n : num){  // extract each element in the form of num
               arr[n]++;  // increment frequency
            }
        }
        
        ArrayList<Integer>list = new ArrayList<>();  
        for(int i = 0; i<1001; i++) 
        {
            if(arr[i] == nums.length) // frequency is equal to length
            {
                list.add(i); // add index in  array list
            }
        }
        return list;
    }
}
