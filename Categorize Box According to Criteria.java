import java.util.*;
import java.io.*;
class Solution {
    public String categorizeBox(int length, int width, int height, int mass) {
        int num = 0;
        if(((long)length*(long)width*(long)height*1l) >= (long)(Math.pow(10,9)) || length >= 10000  || width >= 10000 || height >= 10000)
        {
            num =  1;
        }
        int val = (mass >= 100) ? 1 : 0; // Mass >= 100, so the Box is "Heavy"
        if(num + val == 2)
        {
            return "Both"; // Box is both "Bulky" and "Heavy", then its category is "Both".
        }
        if(num + val == 0)
        {
            return "Neither"; //Box is neither "Bulky" nor "Heavy", then its category is "Neither".
        }
        if(num == 1)
        {
            return "Bulky"; //Box is "Bulky" but not "Heavy", then its category is "Bulky".
        }
        return "Heavy"; //Box is "Heavy" but not "Bulky", then its category is "Heavy".

    }
}
