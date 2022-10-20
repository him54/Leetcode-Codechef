import java.util.*;
class Main{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        long T = sc.nextInt();
        while(T-->0)
        {
           int even = 0;
           int odd = 0;
           
           int[] arr = new int[3];
           for(int i = 0; i<3; i++)
           {
               arr[i] = sc.nextInt();
               if(arr[i] % 2 == 0)
               {
                   even++;
               }
               else{
                   odd++;
               }
           }
           if(even>0 && odd >0)
           {
              System.out.println("Yes");
           }else{
              System.out.println("No");
           }
           
        }
    }
}
