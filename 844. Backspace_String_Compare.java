import java.io.*;
class Solution {
    public boolean backspaceCompare(String s, String t) {
        Stack<Character> st1 = new Stack<>();
        Stack<Character> st2 = new Stack<>();
        for(char ch1 : s.toCharArray())
        {
            if(ch1 != '#'){
                st1.push(ch1);
            }else 
            {
                if (!st1.isEmpty())
                {
                    st1.pop();
                }
            }
        }
        for (char ch2 : t.toCharArray())
        {
            if(ch2 != '#')
            {
                st2.push(ch2);
            }else 
            {
                if (!st2.isEmpty())
                {
                    st2.pop();
                }
            }
        }
         // System.out.println(st1);
        //System.out.println(st2);
        if (st1.isEmpty() && st2.isEmpty())
        {
            return true;
        }
        else
        {
            return st1.equals(st2);
        }
    }
}
