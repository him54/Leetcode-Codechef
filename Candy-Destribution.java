//Problem Code:CANDYDIST
import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
          int N =sc.nextInt();
          int M = sc.nextInt();
          
          if(N % M != 0)
          {
              System.out.println("NO");
          }
          else{
              int D = N/M;
              
              if(D % 2 == 0)
              {
                System.out.println("YES");
              }
              else
                  System.out.println("NO");
              }
          }
        }
    }
}
