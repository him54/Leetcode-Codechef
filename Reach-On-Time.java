import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int X = sc.nextInt();
            if(X < 30) 
            {
                System.out.println("NO"); // Chef will not reach on time
            }
            else{
                System.out.println("YES"); // chef will reach on time
            }
        }
    }
}
