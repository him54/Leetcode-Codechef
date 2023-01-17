import java.io.*;
class Solution {
    public int minFlipsMonoIncr(String s) {
        int n = s.length(); 
        int count1 = 0; // OneCount
        int count2 = 0;//Zero to count
        int i = 0;

        while(i<n && s.charAt(i) == '0')
        {
            i++;
        }
        for(; i<n; i++)
        {
            char ch = s.charAt(i);
            if(ch == '0'){
                count2++;
            }
            else{
                count1++;
            }
            if(count2 > count1){
                count2 = count1; //Update minimum value
            }
        }
    return count2;
    }
}
