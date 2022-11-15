import java.util.*;
class Solution {
    public int xorAllNums(int[] nums1, int[] nums2) {
        
        int bn1 = nums1.length;
        int bn2 = nums2.length;
        
        int Xor1 = 0;
        int Xor2 = 0;
        
        for(int i = 0; i<bn1; i++)
        {
            Xor1 ^= nums1[i];
            
        }
        for(int i = 0; i<bn2; i++)
        {
            Xor2 ^= nums2[i];
        }
         
        int bitwiseXor = 0;
        
        if(bn1 % 2 == 1 && bn2 % 2 == 0)
        {
            bitwiseXor = Xor2;
        }
        else if(bn1 % 2 == 0 && bn2 % 2 == 0)
        {
            bitwiseXor = 0;
        }
        else if(bn1 % 2 == 1 && bn2 % 2 == 1)
        {
            bitwiseXor = Xor1 ^ Xor2;
        }
         else if(bn1 % 2 == 0 && bn2 % 2 == 1)
        {
             bitwiseXor = Xor1;
        }
       return bitwiseXor;
    }
}
