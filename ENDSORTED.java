import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        while(T-->0)
        {
            int N = sc.nextInt();
            int[] arr = new int[N];
            for(int i = 0; i<arr.length; i++)
            {
                arr[i] = sc.nextInt();
            }
            int first = 0;
            int last = arr.length-1;
            for(int i = 0; i<N; i++)
            {
                if(arr[i] == 1)
                {
                first = i;
                }
                if(arr[i] == N)
                {
                    last = i;
                }
            }
            if(last < first)
            {
                System.out.println(first+(N-1-last)-1);
            }
            else{
                System.out.println(first+(N-1-last));
            }
        }
    }
}
