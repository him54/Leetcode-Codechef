import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int cp = countpath(n);
        System.out.println(cp);
    }
    
        
    public static int countpath(int n){
            
        if(n < 0)
        {
            return 0;
            
        }
        else if(n == 0)
        {
                
            return 1;
        }
        int nm1 = countpath(n - 1);
        int nm2 = countpath(n - 2);
        int nm3 = countpath(n - 3);
            
        int cp = nm1 + nm2 + nm3;
        return cp;
    }
            
    
}
