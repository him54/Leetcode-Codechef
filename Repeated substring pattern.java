class Solution {
    public boolean repeatedSubstringPattern(String s) {
        int length = s.length();
        for(int i = 0; i<length / 2; i++){ // we can check only half of the length
            String subString = s.substring(0, i+1);
            
            if(length % subString.length() == 0)
            {
                int nor = length / subString.length();
                StringBuilder sb = new StringBuilder(); //  StringBuiilder is preffered a (general thing + mechanism) it is immutable
                while(nor > 0)
                {
                    sb.append(subString);
                    nor--;
                }
                if(sb.toString().equals(s))
                {
                    return true;
                }
            }
        }
        return false;     
    }
}
