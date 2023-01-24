import java.util.*;
class Solution {
    public int[][] sortTheStudents(int[][] score, int k) {
        int[][] arr = new int[score.length][score[0].length];
        int[] nums = new int[score.length];
        
        for(int i = 0; i<score.length; i++){
            nums[i] = score[i][k];
        }
        Arrays.sort(nums);
        for(int i = 0, t=score.length-1; i<score.length && t >= 0; i++, t--){
            int j = 0;
            while(nums[i] != score[j][k])
            {
                j++;
            }
            arr[t] = score[j];
        }
        return arr;
    }
}
