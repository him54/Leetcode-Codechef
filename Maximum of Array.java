import java.io.*;
import java.util.*;

public class Main {

    public static void main(String[] args) throws Exception {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<arr.length; i++){
            arr[i] = sc.nextInt();
        }
        int max = maxOfArray(arr, 0);
        System.out.println(max);
    }

    public static int maxOfArray(int[] arr, int idx){
        if(idx == arr.length - 1)
        { //base code
            return arr[idx];
        }
        
        int msa = maxOfArray(arr, idx + 1);
        if(msa > arr[idx]){
            return msa;
        }
        else{
            return arr[idx];
        }
    }

}
