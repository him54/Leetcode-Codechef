import java.util.*;
public class Main {
    public static void main(String args[] ) throws Exception {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int D = scanner.nextInt();
        int[] arr = new int[N];
        for(int i = 0; i<N; i++){
            arr[i] = sc.nextInt();
        }
        int w = 1;
        int temp = arr[0];
        int count = 0;
        for(int i = 1;i<n;i++)
        {
            if(temp<D)
            {
                temp = temp + arr[i];
                w = w + 1;
            }
            else if(temp >= D)
            {
                temp = temp - D;
                temp = temp + arr[i];
            }
            if(temp == 0)
            {
                count = count + 1;
            }
            else{
                count = 0;
            }
        }
        if(count != 0)
        {
            count = count - 1;
        }
        System.out.println(w - count);
    }
}
