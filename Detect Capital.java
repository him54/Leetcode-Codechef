import java.util.*;
import java.io.*;
class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.length() <= 1)
        {
            return true;
        }
        char[] ch = word.toCharArray();
        int i = 0;
        boolean isUpper = false;
        if(Character.isUpperCase(ch[0]))
        {
            i = 1;
        }
        if(Character.isUpperCase(ch[i]))
        {
            isUpper = true;
        }
        for(; i < ch.length; i++){
            if(isUpper != Character.isUpperCase(ch[i]))
            {
                return false;
            }
        }
        return true;
    }
}
