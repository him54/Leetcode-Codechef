class Solution {
    ArrayList<Boolean> list;

    int search(int x, int y) {
        for (int i = x + 1; i < y; i++) {
            if(list.get(i)) 
            {
                return i;
            }
        }
        return -1;
    }

    public boolean primeSubOperation(int[] nums) {
        int n = nums.length;
        list = new ArrayList<>(Collections.nCopies(1001, true));
        list.set(0, false);
        list.set(1, false);

        for (int i = 2; i * i < 1001; i++) {
            if (list.get(i)) {
                for (int j = i * i; j <= 1000; j += i) {
                    list.set(j, false);
                }
            }
        }
        for (int i = n - 1; i > 0; i--) {
            if (nums[i] <= nums[i - 1]) 
            {
                int x = search(nums[i - 1] - nums[i], nums[i - 1]);
                if (x == -1)
                {
                    return false;
                }
                nums[i - 1] -= x;
            }
        }
        return true;
    }
}
