class Solution {
    public int differenceOfSum(int[] nums) {
        int element_sum = 0;
        int digit_sum = 0;
        
        for(int x : nums)
        {
            element_sum += x;
            digit_sum += (Digit_Sum(x));
        }
        return Math.abs(element_sum  - digit_sum);
    }
    static int Digit_Sum(int n){
      int temp = 0;
      while(n != 0)  
      {
          temp += (n % 10);
          n = n / 10;
      }
        return temp;
    }
}
