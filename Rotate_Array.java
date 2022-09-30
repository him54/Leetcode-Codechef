class Solution {
public static void reverse(int[] nums, int i, int j){
  while(i<j)
  {
    int temp = nums[i]; //Swap Condition
    nums[i] = nums[j];
    nums[j] = temp;
    i++;
    j--;
        
    }
}
public void rotate(int[] nums, int k) 
  {
      k = k % nums.length;
      if(k<0)  // Value is negativ
      {
        k = k + nums.length;
      }

      reverse(nums, 0, nums.length - k - 1);  //rotate part 1
       
      reverse(nums, nums.length-k, nums.length - 1); // rotate part 2
       
      reverse (nums, 0, nums.length - 1 ); // Full rotation
  }
}
