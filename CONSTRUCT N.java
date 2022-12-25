import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int N = sc.nextInt();
            if(N % 2 == 0 || N % 7 == 0)
            {
                System.out.println("YES");
            }
            else if(N<7 && N != 2)
            {
                System.out.println("NO");
            }
            else{
                int d = N - 9;
                if(d %2 == 0 || d%7 == 0)
                {
                    System.out.println("YES")°
                }
                else{
                    System.out.println("NO");
                }
            }
        }
    }
}
