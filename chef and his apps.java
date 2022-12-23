import java.util.*;
public class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0
        {
            int s = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();
            int z = sc.nextInt();
            
            int diff = s-(x+y);
            if(diff>=z)
            {
                System.out.println(0);
            }
            else{
                int a = z-diff;
                int max = Math.max(x,y);
                if(a > max)
                {
                    System.out.println(2);
                }
                else{
                    System.out.println(1);
                }
            }
        }
    }
}
