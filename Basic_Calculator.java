//TC - O(n)
import java.util.*;
import java.io.*;
class Solution {
    public int calculate(String s) {
        int operator  =1;
        int result = 0;
        int curr = 0;
        Stack<Integer> st = new Stack<>();
        for(int i = 0; i<s.length(); i++)
        {
            if(Character.isDigit(s.charAt(i)))
            {
                curr = s.charAt(i) - '0';
                while(i + 1<s.length() && Character.isDigit(s.charAt(i + 1)))
                {
                    curr = curr * 10 + s.charAt(i+1) - '0';
                    i++;
                }
                curr = curr * operator;
                result += curr;
                curr =0;
            }
            else if(s.charAt(i) == '+')
            {
                operator = 1;
            }
            else if(s.charAt(i) == '-')
            {
                operator = -1;
            }
            else if(s.charAt(i) == '(')
            {
                st.push(result);
                st.push(operator);
                result = 0;
                operator = 1;
            }
            else if(s.charAt(i) ==  ')')
            {
                int prev = st.pop();
                result = prev * result;
                int prev1 = st.pop();
                result = result + prev1;
            }
        }
        return result;
    }
}
