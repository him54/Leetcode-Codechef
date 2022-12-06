import java.io.*;
class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
       HashMap<HashMap<Character, Integer>, ArrayList<String>> map = new HashMap<>();
        
        for(String str : strs)
        {
            HashMap<Character, Integer> freqmap = new HashMap<>();
            for(int i = 0; i<str.length(); i++){
                char ch = str.charAt(i);
                freqmap.put(ch, freqmap.getOrDefault(ch, 0) + 1);
            }
            
            if(map.containsKey(freqmap) == false)
            {
                ArrayList<String> list = new ArrayList<>();
                list.add(str);
                map.put(freqmap, list);
            }
            else{
                ArrayList<String> list = map.get(freqmap);
                list.add(str);
            }
        }
        return new ArrayList<>(map.values());
    }
}
