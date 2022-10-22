import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int X = sc.nextInt();
            if(67<=X && X<=45000)
            {
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}
