import java.util.*;
class Solution {
    public int passThePillow(int n, int time) {
        int nums = 1; //Direction 
        int res = 1; // current person
        for(int i = 0; i<time; i++)
        {
            if(res == 1)
            {
                nums = 1;
            }
            else if(res == n)
            {
                nums = -1;
            }
            res += nums;
        }
        return res;
    }
}
