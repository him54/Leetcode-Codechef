import java.util.*;
class Solution {
    public int vowelStrings(String[] words, int left, int right) {
        int count = 0;
        for (int i = left; i <= right; i++)
        {
            String S = words[i];
           if(S.charAt(0) == 'a' || S.charAt(0) == 'e'||S.charAt(0) == 'i'  ||S.charAt(0) == 'o' ||S.charAt(0) == 'u') 
              {
                  if(S.charAt(S.length() - 1) =='a' || S.charAt(S.length() - 1) =='e' || S.charAt(S.length()- 1) =='i'  || S.charAt(S.length() - 1) =='o'|| S.charAt(S.length() - 1) =='u' )
                  {
                      count++;  //If both the first and last characters are vowels then the count variable is incremented.
                  }
            
              }
        }
        return count;
    }
}
