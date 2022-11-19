import java.util.*;
import java.io.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0 )
        {
            int N = sc.nextInt();
            int ans = 0;
            for(int i = 0; i<N; i++)
            {
                int num = sc.nextInt();
                ans = ans^num;
            }
            System.out.println(ans);
        }
    }
}
