import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
     Scanner sc = new Scanner(System.in);
     int n = sc.nextInt();
     int[] vals = new int[n];
     int[] wts = new int[n];
      
      for(int i = 0; i < vals.length; i++)
      {
        vals[i] = sc.nextInt();
      }
      for(int i = 0; i  < wts.length; i++)
      {
        wts[i] = sc.nextInt();
      }
      int capacity =  sc.nextInt();
      int[][] dp = new int[n + 1][capacity + 1];
        for(int i = 1; i<dp.length; i++){
          for(int j = 1; j<dp[0].length; j++)
          {
            if(j >= wts[i - 1]) // Batting karega
              {
                int rcap = j - wts[i - 1] ;
                if(dp[i - 1][rcap] + vals[i - 1] > dp[i - 1][j]){
                    dp[i][j] = dp[i - 1][rcap] + vals[i - 1];
                }
                else{
                    dp[i][j] = dp[i - 1][j];
                }
              
            }
            else{
                dp[i][j] = dp[i - 1][j]; // Batting nahi karega
            }
          }
        }
        System.out.println(dp[n][capacity]);
    }
}
