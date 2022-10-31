import java.util.*;
class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0){
            String S = sc.next();
            int N = S.length();
            
            String str1 = new String();
            String str2 = new String();
             str1 = S.substring(0, N/2);
            if(N%2 == 0)
            {
                str2 = S.substring(N/2, N);
            }
            else
            {
                str2 = S.substring((N/2)-1, N);
            }
            
            char[] ch1 = str1.toCharArray();
            char[] ch2 = str2.toCharArray();
            Arrays.sort(ch1);
            Arrays.sort(ch2);
            if(Arrays.equals(ch1, ch2))
            {
                System.out.println("YES");
            }else
            {
                System.out.println("NO");
            }
        }
    }
}
