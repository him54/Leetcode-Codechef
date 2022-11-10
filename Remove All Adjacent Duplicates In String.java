import java.util.*;
class Solution {
    public String removeDuplicates(String s) {
        int i = 0;
        int j = 1;
        while (j < s.length())
        {
            char ch1 = s.charAt(i);
            char ch2 = s.charAt(j);
            
            if(ch1 == ch2)
            {
                s = s.substring(0, i) + s.substring(j+1);
                if(i != 0)
                {
                    i--;
                }
                if(j > 1)
                {
                    j--;
                }
            }else {
                i++;
                j++;
            }
        }
        return s;
    }
}
