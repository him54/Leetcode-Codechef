import java.util.*;
class Solution {
    public int longestPalindrome(String[] words) {
        int[][] hm = new int[26][26];
        int max = 0;
        for(String word : words){
            hm[word.charAt(0)-'a'][word.charAt(1)-'a']++;
        }
        int length = 0;
        int odd = 0;
        for(int i=0; i<26; i++)
        {
            for(int j=0; j<26; j++)
            {
                if(hm[i][j] == 0)
                {
                    continue;
                }
                if(i==j)
                {
                    if(hm[i][j]%2!=0)
                    {
                        odd=1;
                    }
                    length += 2*(hm[i][j]-(hm[i][j] % 2 == 0 ?  0 : 1));
                }else if(hm[j][i] != 0)
                {
                    int min = Math.min(hm[i][j], hm[j][i]);
                    length = length +  4*min;
                }
                hm[i][j]=0;
            }
        }
        if(odd == 1)
        {
            length = length + 2;
        }
        return length;  
    }
}
