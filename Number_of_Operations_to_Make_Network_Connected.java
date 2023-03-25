class Solution {
    public int makeConnected(int n, int[][] connections) {
        int[] arr = new int[n];
        int num1 = 0;
        int num2 = 0;
        for(int i = 0; i < n; i++) arr[i] = i;
        for(int[] a : connections)
            if(union(a[0], a[1], arr))
            {
                num2++;
            }
        for(int i = 0; i < n; i++)
        {
            if(find(i, arr) == i)
            {
                num1++;
            }
        }
        if(num2 >= num1 - 1)
        {
            return num1 - 1;
        } 
        return -1;
    }
    
    boolean union(int n1, int n2, int[] arr) {
        if(find(n1, arr) != find(n2, arr))
        {
            arr[arr[n1]] = arr[n2];
            return false;
        }
        else return true;
    }
    
    int find(int n1, int[] arr) {
        if(arr[n1] !=n1)
        {
            arr[n1] = find(arr[n1], arr);
        }
        return arr[n1];
    }
}
