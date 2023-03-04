import java.util.*;
class Solution { 
    public int countWays(int[][] ranges) {
        Arrays.sort(ranges, Comparator.comparingInt(a -> a[0]));
        ArrayList<int[]> list = new ArrayList<>();
        for (int[] range : ranges) {
            if(list.isEmpty() || list.get(list.size() - 1)[1] < range[0]) 
            {
                list.add(range);
            } else
            {
                list.get(list.size() - 1)[1] = Math.max(list.get(list.size() - 1)[1], range[1]);
            }
        }
        int s = list.size();
        return to_power(2, s, (int)1e9+7);
    }
     public int to_power(int base, int exponent, int modulo_value) { //Calculates the power of an integer modulo some other integer.
        if (exponent == 0)
        {
            return 1;
        }
        if (exponent == 1)
        {
            return base;
        }
        long res = to_power(base, exponent / 2, modulo_value);
        res = (res * res) % modulo_value;
        if(exponent % 2 == 1) 
        {
            res = (res * base) % modulo_value;
        }
        return (int)res;
    }
    
}
