class Solution(object):
    def equalFrequency(self, word):
        """
        :type word: str
        :rtype: bool
        """
        freq={}
        minfreq=len(word)
        
        for x in word:
            if x not in freq:
                freq[x]=1
            else:
                freq[x]=freq[x]+1
        for x in freq:
            if freq[x]<minfreq:
                minfreq=freq[x]
        
        t1=minfreq*len(freq)
        
        if t1+1==len(word) or t1==len(word):
            return True
        else:
            return False
