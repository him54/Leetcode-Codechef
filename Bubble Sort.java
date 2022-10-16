import java.util.*;
public class Main
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        int temp = 0;
        
        for(int i = 0; i<arr.length; i++)
        {
            for(int j = 1; j<(arr.length - i); j++)
            {
                if(arr[j - 1] > arr[j])
                {
                    temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        for(int i = 0; i<arr.length; i++)
            {
                System.out.println(arr[i]);
            }
        
    }
}
