import java.util.*;
class Main
{
	public static void main (String[] args) 
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
            int onum = 0;
            for(int i = 0; i<N; i++)
            {
                if(arr[i] == 1)
                {
                    onum++; // increment the orignal number
                }
            }
            int min =  Math.min(onum, N-onum) + (onum - Math.min(onum, N - onum))/ 3;
            System.out.println(min);
            
        }
	}
}
