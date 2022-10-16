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
        
        for(int i = 0; i < arr.length; i++)
        {
            int min = i;
            for(int j = i+1; j<arr.length; j++)
            {
                if(arr[j] < arr[min])
                {
                    min = j;
                }
            }
            
            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
            
            for(int i = 0; i< arr.length; i++)
            {
                System.out.println(arr[i]);
            }
    }
}
