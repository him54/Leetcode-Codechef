//Acquired till the time match is equal to string.length() 
//collect the answer and release them.
//Release match count will be no match our string 2.
class Solution {
    public String minWindow(String s, String t) {
        String ans = "";
        HashMap<Character, Integer> hm2 = new HashMap<>();
        for(int i = 0; i<t.length(); i++){
            char ch = t.charAt(i);
            hm2.put(ch, hm2.getOrDefault(ch, 0) + 1); // hm2 frequency calculate
        }
        
        int mct = 0;
        int desired_count = t.length();
        HashMap<Character, Integer> hm1 = new HashMap<>();
        int i = -1;
        int j = -1;
        
        while(true)
        {
            boolean f1 = false;
            boolean f2 = false;
            
            while(i<s.length()-1 && mct<desired_count)
            {
                i++;
                char ch = s.charAt(i);
                hm1.put(ch, hm1.getOrDefault(ch, 0) + 1); // hm1 frequency calculate
                 
                if(hm1.getOrDefault(ch, 0) <= hm2.getOrDefault(ch, 0))
                {
                    mct++;
                }
                f1 = true;
            }
            while(j<i && mct == desired_count) // Collect our answer and release them
            {
                String ans2 = s.substring(j+1, i+1); // Poltential answer
                if(ans.length() == 0 || ans2.length() < ans.length())
                {
                    ans = ans2;
                }
                j++;
                char ch = s.charAt(j);
                if(hm1.get(ch) == 1)
                {
                    hm1.remove(ch);
                }
                else{
                    hm1.put(ch, hm1.get(ch) - 1);
                }
                if(hm1.getOrDefault(ch, 0) < hm2.getOrDefault(ch, 0))
                {
                    mct--;
                }
                f2 = true;
            }
            if(f1 == false && f2 == false)
            {
                break;
            }
        }
        return ans;    
    }
}
