import java.util.*;
class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int N = sc.nextInt();
            String S = sc.next();
            int COUNT = 0;
            for(int i = 0; i<S.length()-1; i++)
            {
                if(S.charAt(i) == S.charAt(i+1))
                {
                    COUNT++;
                }
            }
            System.out.println(COUNT);
                
        }
    }
}
