import java.io.*;
class Solution {
    public boolean wordPattern(String pattern, String s) {
        String[] arr = s.split(" ");
        int n = pattern.length();
        if(arr.length != n)
        {
            return false;
        }
        HashMap<Character, String> hm = new HashMap<>();
        for(int i = 0; i<n; i++){
            char ch = pattern.charAt(i);
            if(hm.containsKey(ch))
            {
                String value = hm.get(ch);
                if(!value.equals(arr[i]))
                {
                    return false;
                }
            }
            else if(hm.containsValue(arr[i]))
            {
                return false;
            }
            hm.put(ch, arr[i]);
        }
        return true;
    }
}
