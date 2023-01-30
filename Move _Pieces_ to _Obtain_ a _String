class Solution {
    public boolean canChange(String start, String target) {
        int n1 = start.length();
        int n2 = target.length();
        
        while(n1 != n2)
        {
            return false;
        }
        
        int idx1 = 0;
        int idx2 = 0;
        
        while(idx1<n1 || idx2 < n2) 
        {
            while(idx1 < n1 && start.charAt(idx1) == '_') //skil all spaces in target
            {
                idx1++;
            }
            while(idx2 < n2 && target.charAt(idx2) == '_')
            {
                idx2++;
            }
            
            if(idx1 == n1 && idx2 == n2)
            {
                return true;
            }
            if(idx1 == n1 || idx2 == n2 || start.charAt(idx1) != target.charAt(idx2))
            {
                return false;
            }
            if(idx1 < n1 && idx2 < n2)
            {
                if(target.charAt(idx2) == 'L' && idx1 < idx2)
                {
                    return false;
                }
                if(target.charAt(idx2) == 'R' && idx1 > idx2)
                {
                    return false;
                }
            }
            idx1++;
            idx2++;
        }
        return true;
    }
}
