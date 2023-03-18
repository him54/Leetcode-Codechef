import java.util.*;
import java.io.*;
class Solution {
    public int distMoney(int money, int children) {
        if(children > money)
        {
            return -1;
        }
        if(money < 8)
        {
            return 0;
        }
        int num = money / 8;
        int rem = money % 8;
        if(num == children && rem == 0)
        {
            return children;
        }
        if(num >= children)
        {
            return children - 1;
        }
        if(rem == 4 && (children - num) == 1)
        {
            return children - 2;
        }
        if(rem >= children - num)
        {
            return num;
        }
        int x = children - num;
        while(rem < x)
        {
            x++;
            rem += 8;
            num--;
        }
        return num;
    }
}
