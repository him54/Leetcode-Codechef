class Solution {
    public int countDigits(int num) {
        String s = String.valueOf(num);
        int n = s.length();
        int[] arr = new int[10];
        int div = 0;
        for(int i = 0; i<n; i++){
            int temp = s.charAt(i) - '0';
            arr[temp]++;
        }
        for(int i = 0; i<10; i++){
            if(arr[i] != 0){
                if(num % i == 0){
                    div += arr[i];
                }
            }  
        }
        return div;
    }
}
