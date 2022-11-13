import java.util.*;
class Solution {
    public String reverseWords(String s) {
        String[] word = s.split(" ");
        StringBuilder sb = new StringBuilder();
        for (int i = word.length-1; i>=0; i--) {
            if (!word[i].isEmpty())
            {
                sb.append(word[i] + " ");
            }
        }
        return sb.toString().trim();
    }
}
