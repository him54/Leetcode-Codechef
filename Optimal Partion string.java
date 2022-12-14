import java.io.*;
class Solution {
    public int partitionString(String s) {
        int min = 0;
        HashSet<Character> hs = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(hs.contains(ch))
            {
                min++;
                hs = new HashSet<>();
                hs.add(ch);
            }
            else
            {
               hs.add(ch); 
            }
        }
            if(!hs.isEmpty())
            {
                min++;
            }
        return min;
    }
}
