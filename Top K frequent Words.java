import java.util.*;
class Solution {
     class Word {
        String str;
        int freq;
        
       Word(String str, int freq) {
            this.str = str;
            this.freq = freq;
        }
    }
    class WordFrequancyComparaotr implements Comparator<Word> {
        public int compare(Word a, Word b) {
            if(a.freq == b.freq)
            {
                return a.str.compareTo(b.str);
            }
            if(a.freq > b.freq)
            {
                return -1;
            }
            else
            {
              return 1;
            }
        }
    }

    public List<String> topKFrequent(String[] words, int k) {
        HashMap<String, Integer> map = new HashMap<>();
        PriorityQueue<Word> que = new PriorityQueue<>(2, new WordFrequancyComparaotr());
        
        for(String w: words) {
            map.put(w, map.getOrDefault(w, 0) + 1);
        }
        
        for(var entry: map.entrySet()) 
        {
            que.add(new Word(entry.getKey(), entry.getValue()));
        }
        
        ArrayList<String>list = new ArrayList<>();
        int i = 0;
        while(i != k) 
        {
            list.add(que.poll().str);
            i++;
        }
        
        return list;
    }
}
