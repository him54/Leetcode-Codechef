import java.util.*;
import java.io.*;
class Solution{
    Queue<Integer> que;
    int n;
    int total = 0;
    int val = 0;
    public DataStream(int value, int k) {
        que =new LinkedList<>();
        n = k;
        val = value;
    }
    
    public boolean consec(int num) {
        if(que.size() >= n)
        {
            int num2 = que.poll();
            if(num2 == val)
            {
                total--;
            }
           
        }
        if(num == val)
        {
            total++;
        }
        que.add(num);
        if(total == n)
        {
            return true;
        }
        return false;  //Since 2 is less than k, returns False.
    }
}

/**
 * Your DataStream object will be instantiated and called as such:
 * DataStream obj = new DataStream(value, k);
 * boolean param_1 = obj.consec(num);
 */
