//import java.util.*;
class Solution {
    public String reverseVowels(String s) {
        char[] arr = s.toCharArray();
        int left = 0;
        int right = arr.length-1;
        
        while(left < right)
        {
            while(left < right && isVowel(arr, left) == false)
            {
                left++;            
            }
            while(left < right && isVowel(arr, right) == false)
            {
                right--;
            }
            char temp = arr[left];  // Swap
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
        String str = "";
        for(char ch : arr)
        
            str += ch;
        }
        return str;      
    }
    public static boolean isVowel(char[] arr, int idx){
        char ch = arr[idx];
        if(ch == 'a' ||  ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' ||  ch =='E' || ch == 'I' || ch == 'O'|| ch == 'U')
        {
            return true;
        }
        return false;
    }
    
}
