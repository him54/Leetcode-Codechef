class Solution {
    public int commonFactors(int a, int b) {
        int x1 = 0;
        for(int i = 1; i<=a && i<=b; i++)
        {
            if(a % i==0 && b % i==0)
            {
                x1++;
            }
        }
        return x1;
    }
}
