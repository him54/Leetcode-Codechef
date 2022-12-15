class Solution {
    public int countTime(String time) {
        String[] s = time.split(":");
        
        int N1 = 1;
        int N2 = 1;
        
        if(s[0].charAt(0)=='?' && s[0].charAt(1)=='?')
        {
            N1 = 24;
        } else if (s[0].charAt(0)=='?' && s[0].charAt(1)!='?') {
            if(s[0].charAt(1)=='1' || s[0].charAt(1)=='2' || s[0].charAt(1)=='3' || s[0].charAt(1)=='0') 
            {
                N1 = 3;
            } else 
            {
                N1 = 2;
            }
        } else if(s[0].charAt(0)!='?' && s[0].charAt(1)=='?') {
            if(s[0].charAt(0)=='2') 
            {
                N1 = 4;
            } else 
            {
                N1 = 10;
            }
        }
        
        if(s[1].charAt(0)=='?' && s[1].charAt(1)=='?')
        {
            N2 = 60;
        } else if(s[1].charAt(0)=='?' && s[1].charAt(1)!='?') {
            N2 = 6;
        } else if (s[1].charAt(0)!='?' && s[1].charAt(1)=='?') {
            N2 = 10;
        } 
        return N1*N2;
    } 
}
