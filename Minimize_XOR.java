
class Solution {
     public static int cb(int num2)
    {
        int count = 0;
        while(num2 != 0)
        {
            if((num2 & 1) == 1)
            {
                count ++;
            }
            num2 = num2 >> 1;
        }
        return count;
    }
    
    public int minimizeXor(int num1, int num2) {
        
    int x1 = num1; // Start from left of x1 that is maximin set of bits and set bits whic is set in x1 in it should not exceed the count
    int x2 = cb(num2);
        
     int nb = x2;

    int x = 0;
    for(int i=31;i>=0 && nb > 0;i--)
    {
      if((x1 & (1<<i)) > 0) 
      {                
        x =  x | (1<<i); 
        nb--; 
      }        
    }
    
    
    for(int i = 0 ; i <= 31 && nb > 0; i++)
    {
        if((x1 & (1<<i)) == 0)  
        {                
          x =  x | (1<<i); 
          nb--; 
        }  
    }
      return x;
    }
}
